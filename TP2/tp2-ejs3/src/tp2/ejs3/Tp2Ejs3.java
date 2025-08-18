/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs3;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad;
        
        System.out.print("Ingrese su edad: ");
        edad = scan.nextInt();
        
        if (edad < 12) {
            System.out.println("Eres un Ninio.");
        } else if(edad < 18){
            System.out.println("Eres un Adolescente.");
        } else if (edad < 60) {
            System.out.println("Eres un Adulto.");
        }else {
            System.out.println("Eres un Adulto mayor.");
        }
    }
    
}
