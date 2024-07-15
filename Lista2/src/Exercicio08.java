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
public class Exercicio08 {
    public static void main(String[] args){
        int numero1, numero2, numero3, numero4;
        int quadrado1,quadrado2, quadrado3, quadrado4, somaTotal;
        System.out.println("Digite quatro numeros para realizar a operacao:");
        System.out.println("Primeiro numero: ");
        Scanner entrada1 = new Scanner (System.in);
        numero1 = entrada1.nextInt();
        System.out.println("Segundo numero: ");
        Scanner entrada2 = new Scanner (System.in);
        numero2 = entrada2.nextInt();
        System.out.println("Terceiro numero: ");
        Scanner entrada3 = new Scanner (System.in);
        numero3 = entrada3.nextInt();
        System.out.println("Quarto numero: ");
        Scanner entrada4 = new Scanner (System.in);
        numero4 = entrada4.nextInt();
        
        quadrado1 = numero1 * numero1;
        quadrado2 = numero2 * numero2;
        quadrado3 = numero3 * numero3;
        quadrado4 = numero4 * numero4;
        somaTotal = quadrado1 + quadrado2 + quadrado3 + quadrado4;
        
        System.out.println("O resultado da operacao eh " + somaTotal);
    }
}
