/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13;
import java.util.Scanner;
/**
 *
 * @author laiss
 */
public class Exercicio02 {
    public static void main(String[] args) {
        float preco, conta, atraso, porcentagem;
        int quilowatt;
        
        System.out.println("Seja bem vindo! Este eh um programa para calcular o valor da conta de energia.");
        System.out.println("Insira o preco a ser pago por quiowatt:");
        Scanner entrada1 = new Scanner(System.in);
        preco = entrada1.nextFloat();
        System.out.println("Insira quantos quilowatts foram gastos:");
        Scanner entrada2 = new Scanner(System.in);
        quilowatt = entrada2.nextInt();
        
        conta = preco * quilowatt;
        atraso = (conta * 0.1f) + conta;
        
        System.out.println("O valor a ser pago, com pontualidade sera de " + conta + " reais. Com atraso, a conta ficara no valor de " + atraso + " reais.");
    }   
}
