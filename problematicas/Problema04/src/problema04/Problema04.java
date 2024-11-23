/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        float resultado = (float)0.0f;
        int operacion = -1;
        int contador = 3;
        
        System.out.println("Serie generada:");
        
        System.out.print("1 "); 
        resultado += 1.0f;
        
        while(contador <=15){
            
            if (operacion == 1) {
                System.out.printf("- 1/%d ", contador);
            } else {
                System.out.printf("+ 1/%d ", contador);
            }
            
            resultado = resultado + operacion * (1.0f / contador);
            operacion = operacion * -1;
            contador = contador + 2;
        }
           System.out.printf("\nResultado de la serie: %.2f\n", +resultado);
    }
    
}
