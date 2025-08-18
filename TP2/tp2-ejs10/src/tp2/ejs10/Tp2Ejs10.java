/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs10;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int stock, cantidadVendida, cantidadRecibida, nuevoStock;
        String zona;
        
        System.out.print("Ingrese el stock actual del producto: ");
        stock = Integer.parseInt( scan.nextLine());
        
        System.out.print("Ingrese la cantidad vendida:  ");
        cantidadVendida = Integer.parseInt( scan.nextLine());
        
        System.out.print("Ingrese la cantidad recibida:  ");
        cantidadRecibida = Integer.parseInt( scan.nextLine());
        
        nuevoStock = actualizarStock(stock, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock );
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida){ 
        int nuevoStock;
        nuevoStock = (stockActual - cantidadVendida) + cantidadRecibida;
        return nuevoStock;
    }
  
}
   