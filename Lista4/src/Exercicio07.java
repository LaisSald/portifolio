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
public class Exercicio07 {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a altura da sala: ");
        int altura = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite o comprimento da sala: ");
        int comprimento = Integer.parseInt(entrada.nextLine());
        System.out.print("Digite a largura da sala: ");
        int largura = Integer.parseInt(entrada.nextLine());
        
        int areaPiso = comprimento * largura;
        int areaP1 = (comprimento * altura) * 2;
        int areaP2 = (largura * altura) * 2;
        int areaTotal = areaP1 + areaP2;
        int volume = comprimento * largura * altura;
        
        System.out.println("A area do piso sera de " + areaPiso + " metros quadrados.");
        System.out.println("A area total das paredes sera de " + areaTotal + " metros quadrados.");
        System.out.println("O volume da sala sera de " + volume + " metros quadrados.");
        
        if (volume < 100){
            System.out.println("Deve-se instalar um ar condicionado de tamanho pequeno.");
        } else if ((volume > 100) | (volume < 500)){
            System.out.println("Deve-se instalar um ar condicionado de tamanho medio.");
        } else {
            System.out.println("Deve-se instalar um ar condicionado de tamanho grande.");
        }
    }
}
