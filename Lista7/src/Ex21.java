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
public class Ex21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matricula;
        double salarioBase, abono, maiorAbono = 0;
        int contadorRegular = 0;
        double somaAbonosRegular = 0;
        int matriculaMaiorAbono = 0;

        System.out.println("Digite a matrícula do funcionário (negativo para encerrar):");
        matricula = entrada.nextInt();

        while (matricula >= 0) {
            System.out.println("Digite o salário base do funcionário:");
            salarioBase = entrada.nextDouble();

            System.out.println("Digite o nível de produtividade do funcionário:");
            System.out.println("(1) Excelente");
            System.out.println("(2) Bom");
            System.out.println("(3) Regular");
            int nivel = entrada.nextInt();

            switch (nivel) {
                case 1:
                    abono = 0.8 * salarioBase;
                    break;
                case 2:
                    abono = 0.5 * salarioBase;
                    break;
                case 3:
                    abono = 0.3 * salarioBase;
                    contadorRegular++;
                    somaAbonosRegular += abono;
                    break;
                default:
                    System.out.println("Nível de produtividade inválido.");
                    continue;
            }

            if (abono > maiorAbono) {
                maiorAbono = abono;
                matriculaMaiorAbono = matricula;
            }

            System.out.printf("Matrícula: %d - Salário a ser pago: R$ %.2f\n", matricula, salarioBase + abono);

            System.out.println("Digite a matrícula do próximo funcionário (negativo para encerrar):");
            matricula = entrada.nextInt();
        }

        double mediaAbonosRegular = contadorRegular > 0 ? somaAbonosRegular / contadorRegular : 0;

        System.out.println("Funcionário com maior abono:");
        System.out.println("Matrícula: " + matriculaMaiorAbono);
        System.out.printf("Maior abono: R$ %.2f\n", maiorAbono);

        System.out.printf("A media dos abonos para os funcionários classificados como 'Regular': R$ " + mediaAbonosRegular);
    }
}
