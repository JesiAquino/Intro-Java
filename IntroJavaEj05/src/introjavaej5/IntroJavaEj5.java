/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaej5;

import java.util.Scanner;

/**
 *
 * @author Jesica
 */
public class IntroJavaEj5 {
    /*Define una variable de tipo boolean, double y char. 
    * Guarda información en ellas a través del Scanner.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 =leer.nextInt();
        System.out.println("Ingrese otro número");
        int num2= leer.nextInt();
        boolean bandera = num1 < num2;
        System.out.println("El primer número ingresado es menor que el segundo es " +bandera);
        System.out.println("Ingrese  su altura");
        double altura= leer.nextDouble();
        System.out.println("La altura ingresada es " +altura);
        System.out.println("¿Es correcto? S/N");
        char op= leer.next().charAt(0);
                
    }
    
}
