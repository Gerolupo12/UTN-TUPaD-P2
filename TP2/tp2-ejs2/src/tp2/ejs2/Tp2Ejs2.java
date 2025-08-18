/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs2;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        int mayor = 0;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = scan.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        num2 = scan.nextInt();
        
        System.out.print("Ingrese el tercer numero: ");
        num3 = scan.nextInt();
        
        if (num1 > num2) {
            mayor = num1;
        } else if(num2 > num3){
            mayor = num2;
        } else {
            mayor = num3;
        }
        System.out.println("El mayor es: " + mayor);
    }
    
}
