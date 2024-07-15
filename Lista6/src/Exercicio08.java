/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula20;
import java.util.Scanner;
/**
 *
 * @author alunolages
 */
public class Exercicio08 {
    public static void main(String[] args){
        String resposta;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Seja bem vindo ao parque de diversoes!");
        System.out.println("Neste programa, voce podera adquirir seus ingressos!");
        
        do{
            System.out.println("Quantos anos voce tem?");
            int idade = entrada.nextInt();
            
            if (idade < 6){
                System.out.println("Isento de pagamento.");
            } else if ((idade >= 6) & (idade <= 12)){
                System.out.println("Bilhete infantil.");
            } else if ((idade >= 13) & (idade <= 65)){
                System.out.println("Bilhete normal.");
            } else {
                System.out.println("Bilhete de 3° idade.");
            }
            
            System.out.println("Deseja adquirir outro ingresso?");
            resposta = entrada.next();
        } while (!"nao".equals(resposta));
        System.out.println("Fim do programa.");
    }
}
