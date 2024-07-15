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
public class Exercicio06 {
    public static void main (String[] args){
        int distancia;
        int volume;
        int consumo;
        
        System.out.println("Digite a distancia total percorida: ");
        Scanner entrada = new Scanner (System.in);
        distancia = entrada.nextInt();
        System.out.println("Digite o consumo total de combustivel: ");
        Scanner entrada2 = new Scanner (System.in);
        volume = entrada2.nextInt();
        
        consumo = distancia / volume;
        System.out.println("O consumo medio foi de " + consumo + " Km/L.");
    }
}
