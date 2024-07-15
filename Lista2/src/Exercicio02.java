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
public class Exercicio02 {
    public static void main (String[] args){
        int NUMERO, SUCESSOR, ANTECESSOR;
        System.out.println("Digite um numero: ");
        Scanner entrada = new Scanner(System.in);
        NUMERO=entrada.nextInt();
        SUCESSOR = NUMERO+1;
        ANTECESSOR = NUMERO -1;
        System.out.println("O sucessor do numero digitado eh " + SUCESSOR + ", e seu antecessor eh " + ANTECESSOR);
    }
}
