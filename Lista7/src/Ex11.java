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
public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("Digite o nome do aluno:");
            String nome = entrada.nextLine();
            System.out.println("Digite a renda mensal da família (em R$):");
            double rendaMensal = entrada.nextDouble();
            System.out.println("Digite o gasto com alimentação (em R$):");
            double gastoAlimentacao = entrada.nextDouble();
            System.out.println("Digite o gasto com aluguel (em R$):");
            double gastoAluguel = entrada.nextDouble();
            System.out.println("Digite os outros gastos (em R$):");
            double outrosGastos = entrada.nextDouble();

            double gastoTotal = gastoAlimentacao + gastoAluguel + outrosGastos;
            double proporcaoAlimentacao = (gastoAlimentacao / rendaMensal) * 100;
            double proporcaoAluguel = (gastoAluguel / rendaMensal) * 100;

            System.out.println("Nome: " + nome);
            System.out.println("O gasto total foi de " + gastoTotal + " reais.");
            System.out.printf("Proporção de gastos com alimentação: " + proporcaoAlimentacao);
            System.out.printf("Proporção de gastos com aluguel: " + proporcaoAluguel);

            System.out.println("\nDeseja registrar mais algum aluno? (SIM ou NÃO)");
            entrada.nextLine();
            resposta = entrada.nextLine().toUpperCase();

        } while (resposta.equals("SIM"));
    }
}
