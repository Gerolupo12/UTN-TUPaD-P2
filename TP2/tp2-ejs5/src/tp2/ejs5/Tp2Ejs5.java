/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs5;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int suma = 0;
        
        System.out.print("Ingrese un numero (0 para terminar): ");
        num = scan.nextInt();  
          
        while(num != 0){
            if (num % 2 == 0){
                suma += num;
            }
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = scan.nextInt();   
        }
        System.out.println("La suma de los numeros pares es: " + suma);

    } 
}
