/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaej08;

import java.util.Scanner;

/**
 *
 * @author Jesica
 */
public class IntroJavaEj08 {
     /* Escriba un programa que valide si una nota está entre 0 y 10, 
      *sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
    */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int nota = 11;
      while(!(nota > 0 && nota <10)){
      System.out.println("Ingrese nota");
      nota= scanner.nextInt();
      
      }
      
    }
    
}
