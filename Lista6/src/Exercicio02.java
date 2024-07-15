/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20;
import java.util.Scanner;
/**
 *
 * @author laiss
 */
public class Exercicio02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num1, num2, soma;
        
        System.out.println("Digite o primeiro numero:");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = entrada.nextInt();
        
        while (num2 > num1){
            soma = num1 + num2;
            System.out.println("A soma dos dois numeros e igual a " + soma);
            System.out.println("Digite o primeiro numero:");
            num1 = entrada.nextInt();
            System.out.println("Digite o segundo numero:");
            num2 = entrada.nextInt();
        } System.out.println("Fim do programa.");
    }
}
