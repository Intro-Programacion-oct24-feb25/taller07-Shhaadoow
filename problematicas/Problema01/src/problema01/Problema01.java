/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String cadenaReporte = "";
        String nombreJugador;
        String posicionCampo;

        int edad;
        boolean bandera = true;
        String salir;
       
        int sumaEdades = 0;
        float sumaEstaturas = 0;
        
        int contadorIteraciones = 0;
        
        float promedioEdad;
        float promedioEstatura;
        float estatura;
        cadenaReporte = String.format("%s%s\n", cadenaReporte,
                "Listado de Jugadores");

        while (bandera) {
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese la posición en el campo del jugador: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador: ");
            estatura = entrada.nextFloat();

            entrada.nextLine();
            
            contadorIteraciones = contadorIteraciones + 1; 
            sumaEdades = edad;
            sumaEstaturas = estatura;

            
            cadenaReporte = String.format("%s%d.) %s - %s - Edad: %d - "
                    + "Estatura:"
                    + " %.1f m\n",
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);

            
             System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        }
         promedioEdad = (float) sumaEdades / contadorIteraciones;
        promedioEstatura = sumaEstaturas / contadorIteraciones;
       
         cadenaReporte = String.format("%s\nPromedio de edades: %.1f\n"
                 + "Promedio de estaturas: %.1f",
                cadenaReporte,
                promedioEdad,
                promedioEstatura);

        
        System.out.printf("%s\n", cadenaReporte);

    }
}

    

