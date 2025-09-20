/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_operaciones;

/**
 *
 * @author Angie
 */
public class EVA1_21_OPERACIONES {

    public static void main(String[] args) {
        // TODO code application logic here
        //DIFERENTES OPERACIONES:
        //POTENCIA:
        int valor = 2, expo = 3;
        double resu;
        resu = Math.pow(valor, expo);
        System.out.print("2 al cubo = ");
        System.out.println(resu);
        //RAIZ CUADRADA
        int valor2 = 100;
        double resu2;
        resu2 = Math.sqrt(valor2);
        System.out.print("Raiz cuadrada de 100 = ");
        System.out.println(resu2);
        int valor3 = 125;
        double resu3;
        resu3 = Math.pow(valor3, 1.0/3.0);
        System.out.print("La raiz cubica de 125 = ");
        System.out.println(resu3);
        //DIVISION ENTRE ENTEROS
        System.out.print("1/3 = ");
        System.out.println(1.0/3.0);
        
        
        //DIVISION EXACTA?
        int num1= 2024, num2 = 4;
        int residuo;
        residuo = num1 % num2;//calculo del residuo
        System.out.print("2024 / 4 el residuo es ");
        System.out.print(residuo);
        
        
    }
    
}
