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
public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int maiorNumero = Integer.MIN_VALUE;
        int menorNumero = Integer.MAX_VALUE;

        System.out.println("Digite uma série de números inteiros maiores que zero (digite 0 para encerrar):");

        while (true) {
            int numero = entrada.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero > maiorNumero) {
                maiorNumero = numero;
            }

            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        if (maiorNumero == Integer.MIN_VALUE && menorNumero == Integer.MAX_VALUE) {
            System.out.println("Nenhum número válido foi digitado.");
        } else {
            System.out.println("O maior número digitado foi " + maiorNumero);
            System.out.println("O menor número digitado foi " + menorNumero);
        }
    }
}
