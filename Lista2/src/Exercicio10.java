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
public class Exercicio10 {
    public static void main (String[] args){
        int C, F;
        System.out.println("Digite a temperatura em Celsius: ");
        Scanner entrada = new Scanner (System.in);
        C = entrada.nextInt();
        
        F = (9 * C + 160) / 5;
        System.out.println("O resultado da conversao eh " + F);
    }
}
