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
        
        for (int i = 1; i <= 10; i++){
            int resultado = num * i;
            System.out.println(num + " + " + i + " = " + resultado);
        }
        
    }
}
