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
        
        System.out.print("Digite um numero inteiro: ");
        int num1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite outro numero inteiro: ");
        int num2 = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite um ultimo numero inteiro: ");
        int num3 = Integer.parseInt(entrada.nextLine());
        
         int min = Math.min(num1, num2);
         int menor = Math.min(num3, min);
        System.out.println("O menor numero entre eles e o " + menor);
    }
}
