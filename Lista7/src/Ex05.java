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
public class Ex05 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int menores18 = 0;
        int alunos170 = 0;
        int maiores20 = 0;
        int idades170 = 0;
        float alturas20 = 0;
        
        for (int i = 1; i <= 45; i++){
            System.out.print("Digite a idade do aluno: ");
            int idade = Integer.parseInt(entrada.nextLine());
            System.out.print("Digite a altura em metros: ");
            float altura = Float.parseFloat(entrada.nextLine());
            
            if (idade < 18){
                menores18++;
            } else if (idade >= 20){
                maiores20++;
                alturas20 += altura;
            } else if (altura <1.70){
                alunos170++;
                idades170 += idade;
            }
        }
        
        int media170 = idades170 / alunos170;
        float media20 = maiores20 / alturas20;
        
        System.out.println(menores18 + " alunos tem menos de 18 anos.");
        System.out.println("A idade media dos alunos com menos de 1,70m de altura e de " + media170);
        System.out.println("A altura media dos aunos com mais de 20 anos de idade e de " + media20);
    }
}
