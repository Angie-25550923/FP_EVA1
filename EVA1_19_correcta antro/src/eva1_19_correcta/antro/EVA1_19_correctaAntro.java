/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_correcta.antro;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA1_19_correctaAntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int edad;
        boolean credencial;
        System.out.println("***** BIENVENIDO AL ANTRO *****");
        System.out.print("Ingresa tu edad: ");
        edad = captu.nextInt();
        System.out.print("¿Tienes credencial para votar? (true/false) ");
        credencial = captu.nextBoolean();
        //usamos AND &&
        //mayor de edad y tener credencial 
        //(edad >=18) && (credencial == true)
        if ((edad >= 18) && (credencial == true)){
            System.out.println("Puedes entrar!!");
        }else{
             System.out.println("No puedes entrar!!");
            
        }
        
        
        
    }
    
}
