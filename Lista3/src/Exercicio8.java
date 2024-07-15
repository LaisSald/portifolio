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
public class Exercicio8 {
    public static void main(String[] args){
        double salarioMin, valorVendas, salario;
        int vendas;
        
        System.out.println("Este eh um programa para calcular o valor do salario dos funcionarios.");
        System.out.println("Digite o valor do salario minimo:");
        Scanner entrada1 = new Scanner(System.in);
        salarioMin = entrada1.nextDouble();
        System.out.println("Digite a quantidade de vendas do mes:");
        Scanner entrada2 = new Scanner(System.in);
        vendas = entrada2.nextInt();
        System.out.println("Digite o valor arrecadado com as vendas:");
        Scanner entrada3 = new Scanner(System.in);
        valorVendas = entrada3.nextDouble();
        
        salario = (salarioMin * 2) + (150 * vendas) + (valorVendas * 0.05f);
        
        System.out.println("O salario eh de " + salario + " reais.");
    }
}
