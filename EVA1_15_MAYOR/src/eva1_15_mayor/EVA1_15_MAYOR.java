/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA1_15_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Numero 1:");
        num1 = input.nextInt();
        System.out.println("Numero 2:");
        num2 = input.nextInt();
        if(num1 > num2){
            System.out.println("El valor mayor es ");
            System.out.println(num1);
        }else{//IGNORAMOS EL QUE SEAN IGUALES
            System.out.println("El valor mayor es ");
            System.out.println(num2);
            if(num2 > num1){
               System.out.println("El valor mayor es ");
               System.out.println(num2);
            }else{
                System.out.println("Los valores son iguales ");
                
            }
        }
        
      
    }
    
}
