/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20;
import java.util.Scanner;
/**
 *
 * @author alunolages
 */
public class Exercicio07 {
    public static void main(String[] args){
        double valor;
        char resposta = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem vindo! Este programa vai calcular a conta final da sua estadia.");
        
        do {
            System.out.println("Qual o seu nome?");
            String nome = entrada.next();
            System.out.println("Informe o tipo de apartamento utilizado (A, B ou C)");
            char apto = entrada.next().charAt(0);
            System.out.println("Quantas diarias voce utilizou?");
            int diarias = entrada.nextInt();
        
            switch (apto){
                case 'A':
                    valor = 150.0 * diarias;
                    System.out.println("Ola, " + nome + ", sua conta para o apartamento de tipo A esta no valor de " + valor + " reais.");
                    System.out.println("Deseja repetir o programa? (S/N)");
                    resposta = entrada.next().charAt(0);
                    break;
                case 'B':
                    valor = 150.0 * diarias;
                    System.out.println("Ola, " + nome + ", sua conta para o apartamento de tipo B esta no valor de " + valor + " reais.");
                    System.out.println("Deseja repetir o programa? (S/N)");
                    resposta = entrada.next().charAt(0);
                    break;
                case 'C':
                    valor = 75.0 * diarias;
                    System.out.println("Ola, " + nome + ", sua conta para o apartamento de tipo C esta no valor de " + valor + " reais.");
                    System.out.println("Deseja repetir o programa? (S/N)");
                    resposta = entrada.next().charAt(0);
                    break;
            }
        } while (resposta == 'S');
        
        System.out.println("Obrigada pela conianca!");
    }
}    
        
            
