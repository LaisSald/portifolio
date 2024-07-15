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
public class Ex15 {
    public static void main(String[] args) {
        int populacaoA = 120000;
        int populacaoB = 80000;

        double taxaCrescimentoA = 1.5 / 100;  // 1.5%
        double taxaCrescimentoB = 3.5 / 100;  // 3.5%

        int anos = 0;

        while (populacaoB <= populacaoA) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }
        
        System.out.println("Em " + anos + " anos, a população da cidade B (" + populacaoB + " habitantes) vai ultrapassar a população da cidade A (" + populacaoA + " habitantes).");
    }
}
