/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20;
import java.util.Scanner;
/**
 *
 * @author laiss
 */
public class Exercicio05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        float altura;
        int sexo;
        double mediaAlturaMulheres, mediaAlturaTurma;
        double maiorAltura = 0;
        double somaAlturaMulheres = 0;
        double somaAlturaTurma = 0;
        int contadorMulheres = 0;

        
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a altura (em metros) da pessoa " + (i + 1) + ":");
            altura = entrada.nextFloat();
            System.out.println("Informe o código do sexo (1 para masculino, 2 para feminino):");
            sexo = entrada.nextInt();

            somaAlturaTurma += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
            }

            if (sexo == 2) {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            }
        }

        mediaAlturaMulheres = somaAlturaMulheres / contadorMulheres;
        mediaAlturaTurma = somaAlturaTurma / 10;

        System.out.println("Maior altura da turma: " + maiorAltura + " metros");
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " metros");
        System.out.println("Média de altura da turma: " + mediaAlturaTurma + " metros");
    }
}