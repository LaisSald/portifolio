/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;
import java.util.Scanner;
/**
 *
 * @author laiss
 */
public class Ex08 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.print("Digite sua categoria: ");
        char cat = entrada.nextLine().charAt(0);
        System.out.print("Digite seu salario atual: ");
        int salario = Integer.parseInt(entrada.nextLine());
        
        switch (cat){
            case 'A':
                float novo = salario + (salario * 0.1f);
                System.out.println(nome + ", o novo salario para a categoria " + cat + " sera de " + novo + " reais.");
                break;
            case 'B':
                novo = salario + (salario * 0.15f);
                System.out.println(nome + ", o novo salario para a categoria " + cat + " sera de " + novo + " reais.");
                break;
            case 'C':
                novo = salario + (salario * 0.25f);
                System.out.println(nome + ", o novo salario para a categoria " + cat + " sera de " + novo + " reais.");
                break;
            case 'D':
                novo = salario + (salario * 0.15f);
                System.out.println(nome + ", o novo salario para a categoria " + cat + " sera de " + novo + " reais.");
                break;
            case 'E':
                novo = salario + (salario * 0.15f);
                System.out.println(nome + ", o novo salario para a categoria " + cat + " sera de " + novo + " reais.");
                break;
            case 'F':
                novo = salario + (salario * 0.25f);
                System.out.println(nome + ", o novo salario para a categoria " + cat + " sera de " + novo + " reais.");
                break;
            case 'H':
                novo = salario + (salario * 0.10f);
                System.out.println(nome + ", o novo salario para a categoria " + cat + " sera de " + novo + " reais.");
                break;
            default: 
                novo = salario + (salario * 0.30f);
                System.out.println(nome + ", o novo salario para a categoria " + cat + " sera de " + novo + " reais.");
                break;
        }
    }
}
