/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs4;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precio;
        String categoria;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Integer.parseInt( scan.nextLine());
        
        System.out.print("Ingrese la categoria del producto(A,B o C): ");
        categoria = scan.nextLine();
        
        switch (categoria) {
            case "A":
                System.out.println("Descuento aplicado: 10%");
                precio = 0.9 * precio;
                break;
            case "B":
                System.out.println("Descuento aplicado: 15%");
                precio = 0.85 * precio;
                break;
            case "C":
                System.out.println("Descuento aplicado: 20%");
                precio = 0.8 * precio;
                break;
            default:
                System.out.println("Vuelva a ingresar categoria: ");
        }
        System.out.println("Precio final: " + precio);
    }
    
}
