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
public class Ex05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um numero inteiro: ");
        int num = Integer.parseInt(entrada.nextLine());
        
        if (num <= 10){
            System.out.println("O numero digitado corresponde a F1.");
        } else if ((num > 10) | (num <= 100)){
            System.out.println("O numero digitado corresponde a F2.");
        } else {
            System.out.println("O numero digitado corresponde a F3.");
        }
    }
}
