/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA1_10_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // VELOCIDAD = DISTANCIA /TIEMPO
        //m /s
        //DECLARACIÓN:
            double velocidad, distancia, tiempo;
            Scanner captu = new Scanner(System.in);//CREA EL SCANNER
        System.out.println("Introduce la distancia: ");
        distancia = captu.nextDouble();
        System.out.println("Intruce el tiempo: ");
        tiempo = captu.nextDouble();
        //CÁLCULO:
        velocidad = distancia / tiempo;
        System.out.print("La velocidad es:");
        System.out.print(velocidad);
        System.out.print(" m /s");
        
    }
        
        
        
        
        
        
}
    
