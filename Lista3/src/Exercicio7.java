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
public class Exercicio7 {
    public static void main(String[] args){
        float tipo1, tipo2, tipo3, V1, V2, V3, VTotal;
        int Q1, Q2, Q3;
        tipo1 = 1.5f;
        tipo2 = 2;
        tipo3 = 0.75f;
        
        System.out.println("Este eh um programa para calcular os ganhos das vendas de picole.");
        System.out.println("digite a quatidade de unidades vendidas do tipo 1:");
        Scanner entrada1 = new Scanner(System.in);
        Q1 = entrada1.nextInt();
        System.out.println("digite a quatidade de unidades vendidas do tipo 2:");
        Scanner entrada2 = new Scanner(System.in);
        Q2 = entrada2.nextInt();
        System.out.println("digite a quatidade de unidades vendidas do tipo 3:");
        Scanner entrada3 = new Scanner(System.in);
        Q3 = entrada3.nextInt();
        
        V1 = Q1 * tipo1;
        V2 = Q2 * tipo2;
        V3 = Q3 * tipo3;
        VTotal = V1 + V2 + V3;
        
        System.out.println("O valor arrecadado com as vendas do picole tipo 1 foi de " + V1 + " reais, do tipo 2, " + V2 + " reais, e do tipo 3, " + V3 + " reais.");
        System.out.println("O valor total das vendas foi de " + VTotal);
    }
}
