/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_juego_agula_sello;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA1_24_JUEGO_AGULA_SELLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int usuario;
        double resultado=Math.random();
        System.out.println("Aguila o sello (0/1):");
        usuario = input.nextInt();
        System.out.println(Math.random());
        //IMPRIMIR QUE CAE LA MONEDA (AGUILA O SELLO) SEGUN
        //EL VALOR DE RANDOM
        if((usuario ==0) && (resultado > 0.5)){
            System.out.print("Salio aguila");
            System.out.print("Ganaste");
        }
        else if((usuario ==0) && (resultado < 0.5)){
            System.out.print("Salio sello");
            System.out.print("perdiste");
        }
        if((usuario ==1) && (resultado < 0.5)){
            System.out.print("Salio sello");
            System.out.print("Ganaste");        
        }
        else if((usuario ==1) && (resultado > 0.5)){
            System.out.print("Salio aguila");
            System.out.print("perdiste");     
        }
    }
    
}


    
