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
public class Exercicio04 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int uni, codigo;
        float preco, total;
        
        System.out.println("Seja bem vindo! Consulte abaixo o cardapio (ao lado de cada item esta o seu codigo e");
        System.out.println("o preco a ser pago por ele):");
        System.out.println("Cachorro quente - R$ 4,00");
        System.out.println("X salada - R$ 6,00");
        System.out.println("Bauru com ovo - R$ 6,50");
        System.out.println("Refrigerante - R$ 2,00");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Informe o codigo do item que voce deseja:");
        codigo = entrada.nextInt();
        System.out.println("Quantas unidades deste produto voce deseja?");
        uni = entrada.nextInt();
        
        switch (codigo){
            case 100:
                total = 4.0f * uni;
                System.out.println("Voce pediu " + uni + " unidades de Cachorro Quente, o total a pagar eh de " + total);
                break;
            case 101:
                total = 6.0f * uni;
                System.out.println("Voce pediu " + uni + " unidades de X Salada, o total a pagar eh de " + total);
                break;
            case 102:
                total = 6.5f * uni;
                System.out.println("Voce pediu " + uni + " unidades de Bauru com Ovo, o total a pagar eh de " + total);
                break;
            case 103:
                total = 2.0f * uni;
                System.out.println("Voce pediu " + uni + " unidades de Refrigerante, o total a pagar eh de " + total);
                break;
        }
    }
}
