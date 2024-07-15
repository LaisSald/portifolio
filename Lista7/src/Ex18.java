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
public class Ex18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int canal4 = 0;
        int canal5 = 0;
        int canal7 = 0;
        int canal12 = 0;

        int totalPessoas = 0;

        System.out.println("Informe o número do canal e o número de pessoas assistindo (-1 para encerrar):");
        while (true) {
            System.out.print("Número do canal (4, 5, 7 ou 12): ");
            int numeroCanal = entrada.nextInt();

            if (numeroCanal == -1) {
                break;
            } else if (numeroCanal != 4 && numeroCanal != 5 && numeroCanal != 7 && numeroCanal != 12) {
                System.out.println("Número do canal inválido. Digite novamente.");
                continue;
            }

            System.out.print("Número de pessoas assistindo: ");
            int pessoasAssistindo = entrada.nextInt();

            totalPessoas += pessoasAssistindo;

            switch (numeroCanal) {
                case 4:
                    canal4 += pessoasAssistindo;
                    break;
                case 5:
                    canal5 += pessoasAssistindo;
                    break;
                case 7:
                    canal7 += pessoasAssistindo;
                    break;
                case 12:
                    canal12 += pessoasAssistindo;
                    break;
            }
        }

        double porcentagemCanal4 = (double) canal4 / totalPessoas * 100;
        double porcentagemCanal5 = (double) canal5 / totalPessoas * 100;
        double porcentagemCanal7 = (double) canal7 / totalPessoas * 100;
        double porcentagemCanal12 = (double) canal12 / totalPessoas * 100;

        System.out.println("Porcentagem de audiência por canal:");
        System.out.printf("Canal 4: %.2f%%\n", porcentagemCanal4);
        System.out.printf("Canal 5: %.2f%%\n", porcentagemCanal5);
        System.out.printf("Canal 7: %.2f%%\n", porcentagemCanal7);
        System.out.printf("Canal 12: %.2f%%\n", porcentagemCanal12);
    }
}
