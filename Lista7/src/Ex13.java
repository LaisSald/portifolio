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
public class Ex13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int N;

        do {
            System.out.print("Digite um número inteiro entre 3 e 20: ");
            N = entrada.nextInt();

            if (N < 3 || N > 20) {
                System.out.println("Número inválido. Digite novamente.");
            }
        } while (N < 3 || N > 20);

        int termo1 = 0;
        int termo2 = 1;

        System.out.println("Série de Fibonacci até o " + N + "º termo:");

        if (N >= 1) {
            System.out.print(termo1 + " ");
        } else if (N >= 2) {
            System.out.print(termo2 + " ");
        }

        for (int i = 3; i <= N; i++) {
            int proximoTermo = termo1 + termo2;
            System.out.print(proximoTermo + " ");

            termo1 = termo2;
            termo2 = proximoTermo;
        }
    }
}

