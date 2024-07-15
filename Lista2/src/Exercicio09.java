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
public class Exercicio09 {
     public static void main(String[] args){
        double numero;
        double raiz;
        System.out.println("digite um numero: ");
        Scanner entrada = new Scanner (System.in);
        numero = entrada.nextDouble();
        
        raiz = Math.sqrt(numero);
        
        System.out.println("O resultado da operacao eh " + raiz);
    }
}
