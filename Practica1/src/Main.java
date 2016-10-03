
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ventura
 */
public class Main {
    public static void main(String[] args) {
        String opcion;
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        opcion = (entradaEscaner.nextLine());
        
        
        System.out.println("Bienvenido a la Liga BBUV");
        
        do{
            System.out.println("Elige una opcion");
            
            
        }while(opcion != "7");
        
    }
}
