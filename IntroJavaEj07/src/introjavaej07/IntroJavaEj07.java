/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjavaej07;


import java.util.Scanner;

/**
 *
 * @author Jesica
 */
public class IntroJavaEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definicion delobjeto  scanner para la lectura de datos
        //Método - objeto 
        Scanner scanner= new Scanner(System.in);
        int tipo; 
        //Lectura por consola
        System.out.println("Ingrese tippo de bomba. Valor de 1-4 ");
        tipo= scanner.nextInt();
        
        //Condicional Swicht caase
        switch(tipo){
            case 1: 
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2: 
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón ");
                break;
            case 4: 
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
                break;
  
    }
    
}
}
