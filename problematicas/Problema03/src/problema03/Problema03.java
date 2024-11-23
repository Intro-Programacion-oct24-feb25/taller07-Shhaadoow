/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int valor = 2;
        int diferencia = 3;
        int contador = 1;
        
        while(contador <= 6){
            System.out.println(valor);
            valor = valor + diferencia;
            diferencia = diferencia + 2;
            contador = contador + 1;
        }
    }
    
}
