/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_meses;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA1_17_MESES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Meses del año
        int mes;
        Scanner input = new Scanner(System.in);
        System.out.println("Captura el número del mes (1-12):");
        mes = input.nextInt();
        
        if(mes == 1){
            System.out.println("Enero");
        }else if(mes == 2){
            System.out.println("Febrero");
        }else if(mes == 3){
            System.out.println("Marzo");
        }else if(mes == 4){
            System.out.println("Abril");
        }else if(mes == 5){
            System.out.println("Mayo");
        }else if(mes == 6){
            System.out.println("Junio");
        }else if(mes == 7){
            System.out.println("Julio");
        }else if(mes == 8){
            System.out.println("Agosto");
        }else if(mes == 9){
            System.out.println("Septiembre");
        }else if(mes == 10){
            System.out.println("Octubre");
        }else if(mes == 11){
            System.out.println("Noviembre");
        }else if(mes == 12){
            System.out.println("Diciembre");
        }else{
            System.out.println("Número no valido");
    }
    }
}
