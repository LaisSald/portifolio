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
public class Exercicio5 {
    public static void main (String[] args){
        int base, altura, area, perimetro;
        
        System.out.println("Este programa eh feito para calcular a area e o perimetro de um retangulo com basem em suas medidas.");
        System.out.println("Digite a medida da base:");
        Scanner entrada1 = new Scanner(System.in);
        base = entrada1.nextInt();
        System.out.println("Digite a medida da alura:");
        Scanner entrada2 = new Scanner(System.in);
        altura = entrada2.nextInt();
        
        area = base * altura; 
        perimetro = base * 2 + altura * 2;
        System.out.println("A area da figura eh igual a " + area + " e o perimetro, igual a " + perimetro);
    }
}
