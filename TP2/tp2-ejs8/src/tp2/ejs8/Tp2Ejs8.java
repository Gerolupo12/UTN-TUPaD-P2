/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs8;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precioBase, porcImpuesto, desc;
        
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = scan.nextInt();
        
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):  ");
        porcImpuesto = scan.nextInt();
        
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):  ");
        desc = scan.nextInt();
        
        double pfinal = calcularPrecioFinal(precioBase, porcImpuesto, desc);
        System.out.println("El precio final de un producto es: " +  pfinal);
    }
    
    static double calcularPrecioFinal(double precioBase, double impuesto, double descuento){
        double precioFinal;  
        precioFinal = precioBase + (precioBase * (impuesto / 100)) - (precioBase * (descuento / 100));
        return precioFinal;
    } 
}
