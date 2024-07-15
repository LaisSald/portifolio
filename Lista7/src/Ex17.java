/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista;

/**
 *
 * @author laiss
 */
public class Ex17 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        
        int resultado = multiplicarPorSomas(a, b);
        
        System.out.println(a + " * " + b + " = " + resultado);
        
        int x = 10;
        int y = -3;
        
        int resultado2 = multiplicarPorSomas(x, y);
        
        System.out.println(x + " * " + y + " = " + resultado2);
    }

    public static int multiplicarPorSomas(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        
        int resultado = 0;
        
        int absB = Math.abs(b);
        
        for (int i = 0; i < absB; i++) {
            resultado += a;
        }
        
        if (b < 0) {
            resultado = -resultado;
        }
        return resultado;
    }
}
