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
public class Ex02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a nota da primeira prova: ");
        int p1 = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite a nota da segunda prova: ");
        int p2 = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite a nota do trabalho: ");
        int trab = Integer.parseInt(entrada.nextLine());
        
        if ((trab >= 7) && ((p1 >= 6) | (p2 >= 6))){
            System.out.println("Parabens, voce foi aprovado!");
        } else {
            System.out.println("Infelizmente, voce nao foi aprovado.");
        }
        
        
    }
}
