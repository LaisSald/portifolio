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
public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quant = 0;
        int soma = 0;
        double media = 0.0;

        System.out.println("Digite uma série de números inteiros (digite 0 para encerrar):");

        while (true) {
            int numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            quant++;
            soma += numero;
        }

        if (quant > 0) {
            media = (double) soma / quant;
        }

        System.out.println("Quantidade de números digitados (exceto o 0): " + quant);
        System.out.println("Soma de todos os números digitados: " + soma);
        System.out.println("Média de todos os números digitados: " + media);
    }
}
