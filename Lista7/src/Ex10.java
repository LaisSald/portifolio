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
public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção escolhida: Inclusão de cliente");
                    break;
                case 2:
                    System.out.println("Opção escolhida: Alteração de cliente");
                    break;
                case 3:
                    System.out.println("Opção escolhida: Exclusão de cliente");
                    break;
                case 4:
                    System.out.println("Opção escolhida: Visualização de cliente");
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite um número de 1 a 5.");
                    break;
            }
        } while (opcao != 5);

    }

    public static void exibirMenu() {
        System.out.println("=== Menu ===");
        System.out.println("1 - Inclusão de cliente");
        System.out.println("2 - Alteração de cliente");
        System.out.println("3 - Exclusão de cliente");
        System.out.println("4 - Visualização de cliente");
        System.out.println("5 - Sair");
    }
}
