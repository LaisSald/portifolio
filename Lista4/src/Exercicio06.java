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
public class Exercicio06 {
    public static void main(String[] args){
      int p1, p2, trabalho, frequencia;
        
        System.out.println("Seja bem vindo! Este programa ira analisar se o aluno deve ser aprovado ou nao com base nas suas notas.");
        System.out.println("Insira a nota da primeira prova:");
        Scanner entrada1 = new Scanner(System.in);
        p1 = entrada1.nextInt();
        System.out.println("Insira a nota da segunda prova:");
        Scanner entrada2 = new Scanner(System.in);
        p2 = entrada2.nextInt();
        System.out.println("Insira a nota do trabalho:");
        Scanner entrada3 = new Scanner(System.in);
        trabalho = entrada3.nextInt();
        System.out.println("Insira a frequencia do aluno:");
        Scanner entrada4 = new Scanner(System.in);
        frequencia = entrada4.nextInt();
        
        if ((trabalho >= 7) && ((p1 >= 6) | (p2 >= 6)) && (frequencia >= 75)) {
            System.out.println("Aprovado.");
        } else if ((trabalho > 6) && ((p1 >= 6) | (p2 >= 6)) && (frequencia >= 90)){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado.");
        }
    }
}