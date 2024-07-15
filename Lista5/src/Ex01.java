/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lista;
import java.util.Scanner;
/**
 *
 * @author alunolages
 */
public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o preco do quilowatt: ");
        float preco = Float.parseFloat(entrada.nextLine());
        System.out.print("Digite a quantidade gasta: ");
        int quant = Integer.parseInt(entrada.nextLine());
        
        float valor = preco * quant;
        float atraso = valor + (valor * 0.1f);
        System.out.println("O valor a ser pago sera de " + valor + " reais.");
        System.out.println("Se a conta for paga com atraso, o valor passara a ser de " + atraso + " reais.");
        
        if (quant > 70){
            System.out.println("Consumo elevado.");
        } else {
            System.out.println("Voce e um consumidor consciente.");
        }
        
    }
}
