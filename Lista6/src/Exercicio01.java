/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula20;
import java.util.Scanner;
/**
 *
 * @author laiss
 */
public class Exercicio01 {
    public static void main(String[] args) {
        int valor1, valor2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        valor1 = entrada.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2 = entrada.nextInt();
                
        while (valor1 != valor2){
            System.out.println("Digite o primeiro valor:");
            valor1 = entrada.nextInt();
            System.out.println("Digite o segundo valor:");
            valor2 = entrada.nextInt();
        }
    }
}
