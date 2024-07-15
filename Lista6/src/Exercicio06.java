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
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i, idade;
        int totalOtimo = 0;
        int idadeRuim = 0;
        int totalRuim = 0;
        int somaIdadeRuim = 0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        String resposta = null;
        
        for(i=0;i<=20; i++){
            System.out.println("Seja bem vindo ao sistema de avaliacao do cinema!");
            System.out.println("Qual a sua idade?");
            idade = entrada.nextInt();
            System.out.println("Qual sua opiniao sobre o filme? Avalie de acordo com as classificacoes abaixo:");
            System.out.println("A - Otimo");
            System.out.println("B - Bom");
            System.out.println("C - Regular");
            System.out.println("D - Ruim");
            resposta = entrada.next();
            switch (resposta){
                case "A":
                    totalOtimo++;
                    break;
                case "D":
                    totalRuim++;
                    somaIdadeRuim += idade;
                    break;
            }
            
            if (idade > maiorIdade){
                maiorIdade = idade;
            } else if (idade < menorIdade){
                menorIdade = idade;
            }
        }    
        
        double mediaIdadeRuim = somaIdadeRuim / totalRuim;
        int diferencaIdade = maiorIdade - menorIdade;
        
        System.out.println("A quantidade de pessoas que responderam Otimo foi de " + totalOtimo + " pessoas.");
        System.out.println("A media de idade das pessoas que responderam Ruim foi de " + mediaIdadeRuim + ".");
        System.out.println("A diferenca da pessoa mais velha a responder o questionario com a pessoa mais nova, foi de " + diferencaIdade + ".");
    }
}
