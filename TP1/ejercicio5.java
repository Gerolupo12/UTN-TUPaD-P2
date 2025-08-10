/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingresa tu primer numero: ");
        num1 = Integer.parseInt( input.nextLine());
        
        System.out.print("Ingresa tu segundo numero: ");
        num2 = Integer.parseInt( input.nextLine());
        
        System.out.println("La suma entre " + num1 + " y " + num2 + " es igual a " + (num1 + num2));
        System.out.println("La resta entre " + num1 + " y " + num2 + " es igual a " + (num1 - num2));
        System.out.println("El producto entre " + num1 + " y " + num2 + " es igual a " + (num1 * num2));
        System.out.println("La division entre " + num1 + " y " + num2 + " es igual a " + (num1 / num2));
    }
    
}
