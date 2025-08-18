/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs1;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anio;
        
        System.out.print("Ingrese un anio: ");
        anio = scan.nextInt();
        
        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)){
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");
        }
    }
    
}
