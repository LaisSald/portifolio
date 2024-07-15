/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;
import java.util.Scanner;
/**
 *
 * @author laiss
 */
public class Exercicio08 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Quanto tempo se passou entre voce ter visto o raio ate voce ouvir o som do trovao?");
        System.out.print("Informe o valor em segundos: ");
        float tempo = Float.parseFloat(entrada.nextLine());
        
        float distancia = 340 * tempo;
        
        System.out.println("O raio caiu a " + distancia + " metros de voce.");
        
        if (distancia < 200){
            System.out.println("Representou perigo.");
        } else {
            System.out.println("Nao representou perigo.");
        }
    }
}
