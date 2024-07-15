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
public class Exercicio07 {
    public static void main (String[] args){
        int numero, quadrado;
        
        System.out.println("Digite um numero: ");
        Scanner entrada = new Scanner (System.in);
        numero = entrada.nextInt();
        
        quadrado = numero * numero;
        System.out.println("O resultado da operacao eh: " + quadrado);
    }
}
