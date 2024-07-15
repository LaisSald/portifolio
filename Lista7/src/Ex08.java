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
public class Ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeNumeros = 0;
        int somaNumeros = 0;
        double mediaNumeros = 0.0;

        System.out.println("Digite uma série de números inteiros maiores que zero (digite 0 para encerrar):");

        while (true) {
            int numero = lerNumeroPositivo(entrada);

            if (numero == 0) {
                break;
            }

            quantidadeNumeros++;
            somaNumeros += numero;
        }

        if (quantidadeNumeros > 0) {
            mediaNumeros = (double) somaNumeros / quantidadeNumeros;
        }

        System.out.println("Quantidade de números digitados (exceto o 0): " + quantidadeNumeros);
        System.out.println("Soma de todos os números digitados: " + somaNumeros);
        System.out.println("Média de todos os números digitados: " + mediaNumeros);

    }

    public static int lerNumeroPositivo(Scanner scanner) {
        int numero;
        do {
            System.out.print("Digite um número inteiro maior que zero: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("Número inválido. Digite novamente.");
            }
        } while (numero <= 0);
        return numero;
    }
}
