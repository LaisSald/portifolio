/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;
import java.util.Scanner;
/**
 *
 * @author alunolages
 */
public class Exercicio4 {
    public static void main(String[] args){
        int A, B, soma, SQ;
        
        System.out.println("Programa para calcular o quadrado da soma dos numeros apresentados.");
        System.out.println("Digite o primeiro numero para a operacao:");
        Scanner entradaA = new Scanner(System.in);
        A = entradaA.nextInt();
        System.out.println("Digite o segundo numero para a operacao:");
        Scanner entradaB = new Scanner(System.in);
        B = entradaB.nextInt();
        
        soma = A + B;
        SQ = soma * soma;
        System.out.println("O resultado da operacao eh " + SQ);
        
    }
}
