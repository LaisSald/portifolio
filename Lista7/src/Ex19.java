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
public class Ex19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o limite inferior do intervalo (em graus Celsius):");
        double limiteInferior = entrada.nextDouble();

        System.out.println("Digite o limite superior do intervalo (em graus Celsius):");
        double limiteSuperior = entrada.nextDouble();

        System.out.println("Digite o incremento (em graus Celsius):");
        double incremento = entrada.nextDouble();

        System.out.println("Tabela de Converso de Celsius para Fahrenheit");
        System.out.println("===========================================");
        System.out.println("Celsius | Fahrenheit");
        System.out.println("===========================================");

        for (double celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (9.0 / 5.0) * celsius + 32;

            System.out.printf("%.2f \t\t %.2f\n", celsius, fahrenheit);
        }
    }
}
