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
public class Ex06 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double novoSalario;
        
        System.out.print("Quantos funcionarios possui a empresa? ");
        int funcionarios = Integer.parseInt(entrada.nextLine());
        
        for ( int i = 1; i <= funcionarios; i++){
            System.out.print("Digite o nome do funcionario: ");
            String nome = entrada.nextLine();
            System.out.print("Insira a categoria: ");
            char cat = entrada.nextLine().charAt(0);
            System.out.print("Digite seu salario atual: ");
            float salario = Float.parseFloat(entrada.nextLine());
            
            switch (cat){
                case 'A':
                    novoSalario = salario + (salario * 0.10);
                    break;
                case 'B':
                    novoSalario = salario + (salario * 0.12);
                    break;
                case 'C':
                    novoSalario = salario + (salario * 0.14);
                    break;
                case 'D':
                    novoSalario = salario + (salario * 0.16);
                    break;
                case 'E':
                    novoSalario = salario + (salario * 0.18);
                    break;
                case 'F':
                    novoSalario = salario + (salario * 0.20);
                    break;
                case 'G':
                    novoSalario = salario + (salario * 0.22);
                    break;
                case 'H':
                    novoSalario = salario + (salario * 0.24);
                    break;
                case 'I':
                    novoSalario = salario + (salario * 0.26);
                    break;
                case 'J':
                    novoSalario = salario + (salario * 0.28);
                    break;
                default: 
                    novoSalario = salario + (salario * 0.30);
            }
            
            System.out.println(nome + ", o novo salario para a categoria " + cat + ", sera de " + novoSalario + " reais.");
        }
    }
}
