/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class EVA1_18_ACCESO {
    //CONSTANTES: identificadores que no pueden
    //cambiar de valor. Es con la palabra final
    //static: para que se pueda usar en el main
    final static String USUARIO = "Angeles";
    final static String PWD = "1234";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, contraseña;
        Scanner input = new Scanner(System.in);
        System.out.println("*****BIENVENIDO****");
        System.out.println("Sistema de venta Restaurante la C");
        System.out.println("Usuario: ");
        usuario = input.nextLine();
        System.out.println("Contraseña: ");
        contraseña = input.nextLine();
        //equals compara texto 
        if(usuario.equals(USUARIO)){//usuario correcto
            if(contraseña.equals(PWD)){
                System.out.println("ACESSO CONCEDIDO!");
            }else{//contraseña incorrecta
                System.out.println("ACESSO CONCEDIDO!");   
            }
        }else{//usuario incorrecto
            System.out.println("INCORRECTO!!");
        }
       
        
       
    }
    
}
