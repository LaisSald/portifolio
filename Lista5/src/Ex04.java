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
public class Ex04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int num = Integer.parseInt(entrada.nextLine());
        
        if (num % 2 == 0){
            System.out.println("O numero e impar.");
        } else {
            System.out.println("O numero e par.");
        }
    }   
}
