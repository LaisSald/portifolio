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
public class Exercicio10 {
    public static void mains(String[] args){
        float pista;
        int peso, visib, chuva,passageiros;
        
        System.out.println("Seja bem vindo! Este eh um programa para analisar as condicoes de decolagem de um voo.");
        System.out.println("Insira o tamanho da pista:");
        Scanner entrada1 = new Scanner(System.in);
        pista = entrada1.nextFloat();
        System.out.println("Insira, em toneladas, o peso do aviao:");
        Scanner entrada2 = new Scanner(System.in);
        peso = entrada2.nextInt();
        System.out.println("Insira o alcance de visibilidade, em metros:");
        Scanner entrada3 = new Scanner(System.in);
        visib = entrada3.nextInt();
        System.out.println("Instira, em mm, o indice de chuvas ");
        Scanner entrada4 = new Scanner(System.in);
        chuva = entrada4.nextInt();
        System.out.println("Insira o numero de passageiros no voo:");
        Scanner entrada5 = new Scanner(System.in);
        passageiros = entrada5.nextInt();
        System.out.println("O aviao possui sistem de decolagem coputadorizada?");
        System.out.println("Se sim, digite 'sim', caso contrario digite 'nao':");
        Scanner entrada6 = new Scanner(System.in);
    }
}
