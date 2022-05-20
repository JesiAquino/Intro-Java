/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava06;

import java.util.Scanner;

/**
 *
 * @author Jesica
 */
public class IntroJava06 {
    /*Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
      alguno de ellos es mayor a 25 
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        
       if (num1== 25 && num2== 25){
           System.out.println("Ambos números ingresados es igual a 25");
        } else if(num1==25){
           System.out.println("El primer número ingresado es igual a 25");
        } else if(num2==25){
            System.out.println("el segundo número ingresado es igual a 25");
        } else{
            System.out.println("Ningún número ingresado es igual a 25");
        }
    
    }
}

