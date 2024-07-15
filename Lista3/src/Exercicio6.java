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
public class Exercicio6 {
    public static void main (String[] args){ 
        float C, F;
        
        System.out.println("Este programa eh um coversor de temperatura Celsius para Fahrenheit.");
        System.out.println("Digite a temperatua em celsius que deseja converter:");
        Scanner entrada = new Scanner(System.in);
        C = entrada.nextFloat();
        F = (9/5f) * C + 32;
        System.out.println("Sua temperatura corresponde a " + F + " graus Fahrenheit");
    }
}
