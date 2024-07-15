/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;
import java.util.Scanner;
/**
 *
 * @author laiss
 */
public class Exercicio04 {
    public static void main(String[] args){
        int peso;
        float altura, IMC;
        
        System.out.println("Seja bem vindo! Este eh um programa para calculos de IMC");
        System.out.println("Insira seu peso:");
        Scanner entrada1 = new Scanner(System.in);
        peso = entrada1.nextInt();
        System.out.println("Insira sua altura:");
        Scanner entrada2 = new Scanner(System.in);
        altura = entrada2.nextFloat();
        
        IMC = peso / (altura * altura);
        
        System.out.println("O IMC eh igual a " + IMC);
        
        if (IMC > 25){
            System.out.println("Acima do peso.");
        } else {
            System.out.println("Peso saudavel.");
        }
    }
}
