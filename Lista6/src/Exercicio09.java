/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20;
import java.util.Scanner;
/**
 *
 * @author laiss
 */
public class Exercicio09 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem vindo! Este programa ira calcular o valor do seu imposto de renda.");
        System.out.println("Digite seu CPF:");
        long cpf = entrada.nextLong();
        
        do {
            System.out.println("Informe sua renda mensal:");
            double renda = entrada.nextDouble();
            System.out.println("Informe sua classe, de acordo com a classificacao de A a E:");
            char classe = entrada.next().charAt(0);
            
            switch (classe){
                case 'A':
                    System.out.println("Isento.");
                    break;
                case 'B':
                    System.out.println("Aliquota de 5%.");
                    double desconto = renda * 0.05f;
                    System.out.println("O valor a ser descontado sera de " + desconto);
                    break;
                case 'C':
                    System.out.println("Aliquota de 10%.");
                    desconto = renda * 0.10f;
                    System.out.println("O valor a ser descontado sera de " + desconto);
                    break;
                case 'D':
                    System.out.println("Aliquota de 15%.");
                    desconto = renda * 0.15f;
                    System.out.println("O valor a ser descontado sera de " + desconto);
                    break;
                case 'E':
                    System.out.println("Aliquota de 20%.");
                    desconto = renda * 0.20;
                    System.out.println("O valor a ser descontado sera de " + desconto);
                    break;
            }
            
            System.out.println("Se voce deseja realizar o calculo novamente, digite outro cpf:");
            System.out.println("Caso contrario, digite '00'.");
            cpf = entrada.nextLong();
        } while (cpf != 00);
        System.out.println("Fim do programa.");
    }
}
