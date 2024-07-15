/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13;
import java.util.Scanner;
/**
 *
 * @author laiss
 */
public class Exercicio11 {
    public static void main(String[] args){
      System.out.println("Seja bem vindo! Este eh um programa para calcular os gastos de combustivel em uma viagem.");
      System.out.println("Insira, em km, a distancia a ser percorrida:");
      Scanner distancia = new Scanner(System.in);
      distancia.nextInt();
      System.out.println("Insira o consumo medio do seu veiculo:");
      Scanner consumo = new Scanner(System.in);
      consumo.nextInt();
      System.out.println("Insira o preco do combustivel:");
      Scanner preco = new Scanner(System.in);
      preco.nextFloat();
  }
}
