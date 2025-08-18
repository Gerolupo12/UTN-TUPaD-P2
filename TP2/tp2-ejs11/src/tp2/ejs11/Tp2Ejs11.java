/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs11;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs11 {
    
    public static double desc = 0.10;
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double precio, descuentoEspecial;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Integer.parseInt( scan.nextLine());
        
        descuentoEspecial = calcularDescuentoEspecial(precio);
        
        
        System.out.println("El descuento especial aplicado es:  " + desc * 100);
        
        
        System.out.println("El precio final con descuento es:  " + descuentoEspecial);
    }
    
    static double calcularDescuentoEspecial(double precio){ 
       double descuentoAplicado, precioFinal;
       descuentoAplicado = desc * 100;
       precioFinal = precio - (precio * desc);
       return precioFinal;
    }
  
}   
