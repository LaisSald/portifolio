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
public class Exercicio09 {
    public static void main(String[] args){
        int compra, pago, troco, notas100, notas10, notas1;
        
        System.out.println("Seja bem vindo! Este eh um programa para calcular o valor de troco a ser dado ao cliente.");
        System.out.println("Insira o valor da compra:");
        Scanner entrada1 = new Scanner(System.in);
        compra = entrada1.nextInt();
        System.out.println("Insira o valor pag pelo cliente:");
        Scanner entrada2 = new Scanner(System.in);
        pago = entrada2.nextInt();
        
        troco = pago - compra;
    }
}
