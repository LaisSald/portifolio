/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;
import java.util.Scanner;
/**
 *
 * @author laiss
 */
public class Ex20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        
        System.out.println("Digite o primeiro termo da série de Ricci:");
        int primeiroTermo = entrada.nextInt();
        System.out.println("Digite o segundo termo da série de Ricci:");
        int segundoTermo = entrada.nextInt();

        do {
            System.out.println("Digite a quantidade de termos a serem apresentados (n >= 3):");
            n = entrada.nextInt();
        } while (n < 3);

        int[] ricci = new int[n];
        ricci[0] = primeiroTermo;
        ricci[1] = segundoTermo;

        System.out.println("Série de Ricci com " + n + " termos:");
        System.out.print(ricci[0] + " " + ricci[1] + " ");

        int soma = ricci[0] + ricci[1];
        for (int i = 2; i < n; i++) {
            ricci[i] = ricci[i - 1] + ricci[i - 2];
            System.out.print(ricci[i] + " ");
            soma += ricci[i];
        }

        System.out.println("Soma dos termos da série de Ricci: " + soma);
    }
}
