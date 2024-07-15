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
public class Ex03 {
    public static void mains(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite seu peso em kg: ");
        int peso = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite sua altura em metros: ");
        float altura = Float.parseFloat(entrada.nextLine());
        
        float imc= peso / (altura * altura);
        System.out.println("Seu imc e " + imc);
        
        if (imc < 20){
            System.out.println("abaixo do peso.");
        } else if ((imc > 20) && (imc < 24.9)){
            System.out.println("peso normal.");
        } else if ((imc > 25) && (imc < 30)){
            System.out.println("voce esta com sobrepeso.");
        } else {
            System.out.println("voce esta obeso.");
        }
        
    }
}
