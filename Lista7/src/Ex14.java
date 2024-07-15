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
public class Ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidadeMasculino = 0;
        int quantidadeFeminino = 0;
        int quantidadeIndefinido = 0;
        int quantidadeExperiencia = 0;
        int quantidadeSemExperiencia = 0;
        int somaIdadeExperiencia = 0;
        int somaIdadeSemExperiencia = 0;
        int quantidadeCandidatos = 0;
        int idadeMaisJovem = Integer.MAX_VALUE;
        int quantidadeExperienciaMenor35Anos = 0;

        System.out.println("Digite os dados dos candidatos (gênero: M, F, I ou X para terminar):");
        while (true) {
            System.out.print("Gênero (M/F/I/X): ");
            char genero = entrada.next().charAt(0);
            if (genero == 'X') {
                break;
            }

            System.out.print("Idade: ");
            int idade = entrada.nextInt();

            System.out.print("Experiência no serviço (S/N): ");
            char experiencia = entrada.next().charAt(0);

            switch (genero) {
                case 'M':
                    quantidadeMasculino++;
                    break;
                case 'F':
                    quantidadeFeminino++;
                    break;
                case 'I':
                    quantidadeIndefinido++;
                    break;
                default:
                    System.out.println("Gênero inválido. Digite novamente.");
                    continue;
            }
            
            if (experiencia == 'S') {
                quantidadeExperiencia++;
                somaIdadeExperiencia += idade;
                if (idade < 35) {
                    quantidadeExperienciaMenor35Anos++;
                }
            } else if (experiencia == 'N') {
                quantidadeSemExperiencia++;
                somaIdadeSemExperiencia += idade;
            } else {
                System.out.println("Opção de experiência inválida. Digite novamente.");
                continue;
            }

            if (idade < idadeMaisJovem) {
                idadeMaisJovem = idade;
            }

            quantidadeCandidatos++;
        }

        double mediaIdadeExperiencia = quantidadeExperiencia > 0 ? (double) somaIdadeExperiencia / quantidadeExperiencia : 0;
        double mediaIdadeSemExperiencia = quantidadeSemExperiencia > 0 ? (double) somaIdadeSemExperiencia / quantidadeSemExperiencia : 0;

        double percentualExperienciaMenor35 = quantidadeExperiencia > 0 ?
                (double) quantidadeExperienciaMenor35Anos / quantidadeExperiencia * 100 : 0;

        System.out.println("RESULTADOS:");
        System.out.println("Quantidade de candidatos por gênero:");
        System.out.println("Masculino: " + quantidadeMasculino);
        System.out.println("Feminino: " + quantidadeFeminino);
        System.out.println("Indefinido: " + quantidadeIndefinido);
        System.out.println("Total de candidatos: " + quantidadeCandidatos);
        System.out.println("Quantidade de candidatos com experiência: " + quantidadeExperiencia);
        System.out.println("Quantidade de candidatos sem experiência: " + quantidadeSemExperiencia);
        System.out.println("Idade média dos candidatos com experiência: " + mediaIdadeExperiencia);
        System.out.println("Idade média dos candidatos sem experiência: " + mediaIdadeSemExperiencia);
        System.out.printf("Percentual de candidatos com experiência e idade inferior a 35 anos: %.2f%%\n", percentualExperienciaMenor35);
        System.out.println("Idade do candidato mais jovem: " + idadeMaisJovem);
    }
}
