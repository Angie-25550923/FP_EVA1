/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA1_19_ANTRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("***** BIENVENIDO AL ANTRO *****");
        System.out.print("Ingresa tu edad: ");
        int edad = input.nextInt();
        input.nextLine(); // limpiar buffer

        System.out.print("¿Tienes credencial? (si/no): ");
        String tieneCredencial = input.nextLine();

        if (edad >= 18) { // si es mayor de edad
            if (tieneCredencial.equals("si")) {
                System.out.println("Puedes entrar al antro. ¡Diviértete!");
            } else {
                System.out.println(" Necesitas presentar tu credencial para entrar.");
            }
        } else {
            System.out.println("Lo sentimos, debes ser mayor de edad para entrar.");
        }
    }
    
}
