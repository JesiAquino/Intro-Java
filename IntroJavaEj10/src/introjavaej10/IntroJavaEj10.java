/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaej10;

import java.util.Scanner;

/**
 *
 * @author Jesica
 */
public class IntroJavaEj10 {
    /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
     * e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int num;
     int cond=0;
     
     do{
         System.out.println("Ingrese número"); 
         num= scanner.nextInt();
         if(num >= 1 && num <= 20){
             System.out.print(+num);
             for (int i = 0; i < num; i++) {
                 System.out.print("*");
                
                
             }
              System.out.println("");
              cond++;
         }
         else{
              System.out.println("El número tiene ue estar entre 1 y 20");
                    
             }
           
         
     }while(cond < 4);
    }
    
}
