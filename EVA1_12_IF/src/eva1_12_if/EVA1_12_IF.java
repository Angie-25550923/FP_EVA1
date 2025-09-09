/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA1_12_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //Declaramos:
        int califa;
        Scanner captu = new Scanner(System.in);//CREA EL SCANNER
        System.out.println("Introduce la calificación: ");
        califa = captu.nextInt();
        //ESTRUCTURA DE CONTROL IF
        if(califa >= 70) {//bloque verdadero
            System.out.println("Acreditado!!");
        }else{//bloque falso --> opcional SI-NO
            System.out.println("No acreditado!!");
        
        }
    }
    
}
