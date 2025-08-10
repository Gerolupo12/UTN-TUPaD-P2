/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int edad;
        String nombre;
        
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt( input.nextLine());
        
        System.out.print("Ingresa tu nombre: ");
        nombre = input.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad);
    }
    
}
