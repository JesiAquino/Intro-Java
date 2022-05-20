/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaej09;

import java.util.Scanner;

/**
 *
 * @author Jesica
 */
public class IntroJavaEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num;
        int cond=0;
        int suma=0;
        do{
            System.out.println("Ingrese número");
            num= scanner.nextInt();
            cond++;
            if(num > 0){
                 suma= suma +num;
               }
            else if(num == 0) {
               System.out.println("Se capturó el número 0");
                break;
            }
        }while (cond !=20);
        System.out.println("La suma de los números positivos ingresados es " +suma);
    }
}
    