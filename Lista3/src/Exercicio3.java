/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;
import java.util.Scanner;
/**
 *
 * @author alunolages
 */
public class Exercicio3 {
    public static void main(String[] args) {
        int A, B, SQ, quadradoA, quadradoB;
        
        System.out.println("Programa para calcular a soma dos quadrados dos numeros apresentados:");
        System.out.println("Digite o primeiro numero para a operacao:");
        Scanner entradaA = new Scanner (System.in);
        A = entradaA.nextInt();
        System.out.println("Digite o segundo numero para a operacao:");
        Scanner entradaB = new Scanner (System.in);
        B = entradaB.nextInt();
        
        quadradoA = A * A;
        quadradoB = B * B; 
        SQ = quadradoA + quadradoB;
        System.out.println("O resultado da sua operacao eh " + SQ);
    }
}
