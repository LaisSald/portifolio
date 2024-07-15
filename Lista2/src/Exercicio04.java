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
public class Exercicio04 {
    public static void main (String[] args){
        String nome, endereco;
        double telefone;
        
        System.out.println("Digite seu nome: ");
        Scanner entrada = new Scanner (System.in);
        nome = entrada.nextLine();
        System.out.println("Digite seu endereco: ");
        Scanner entrada2 = new Scanner (System.in);
        endereco = entrada2.nextLine();
        System.out.println("Digite seu telefone: ");
        Scanner entrada3 = new Scanner (System.in);
        telefone = entrada3.nextDouble();
        
        System.out.println("Os dados digitados foram:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
    }
}
