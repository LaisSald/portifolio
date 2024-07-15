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
public class Exercicio05 {
    public static void main (String[] args){
        float x, y;
        System.out.println("Digite o valor da funcao: ");
        Scanner entrada = new Scanner(System.in);
        x = entrada.nextFloat();
        
        y = 3 * x + 2;
        System.out.println("O resultado da operacao eh: " + y);
    }
}
