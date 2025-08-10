/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        
        System.out.print("Ingresa tu primer numero: ");
        num1 = Integer.parseInt( input.nextLine());
        
        System.out.print("Ingresa tu segundo numero: ");
        num2 = Integer.parseInt( input.nextLine());
        
        System.out.println("El numero " + num1 + " dividido " + num2 + " es igual a " + (num1 / num2));
    }
    
}
