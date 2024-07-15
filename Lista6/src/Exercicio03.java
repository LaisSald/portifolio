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
public class Exercicio03 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade;
        String nome, sexo;
        
        System.out.println("Digite seu nome:");
        nome = entrada.next();
        System.out.println("Insrira seu genero:");
        sexo = entrada.next();
        System.out.println("Digite sua idade:");
        idade = entrada.nextInt();
        
        while (idade != 0){
            System.out.println("Dados arquivados com sucesso!");
            System.out.println("Digite seu nome:");
            nome = entrada.next();
            System.out.println("Insrira seu genero:");
            sexo = entrada.next();
            System.out.println("Digite sua idade:");
            idade = entrada.nextInt();
        } System.out.println("Fim do programa.");
    }
}
