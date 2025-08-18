/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs7;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.print("Ingrese una nota(0-10): ");
        num = scan.nextInt(); 
        do {  
            if (num > 10 || num < 0) {
            System.out.println("Error: Nota Invalida. Ingrese una nota entre 0 y 10.");
            System.out.print("Ingrese una nota(0-10): ");
            num = scan.nextInt(); 
            }
        } while (num > 10 || num < 0);   
        System.out.println("Nota guardada correctamente.");
    }
    
}
