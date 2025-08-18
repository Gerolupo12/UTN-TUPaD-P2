/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs12;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }
        
        System.out.println("Precios Modificados:");
        precios[0] = 200.0;
        precios[1] = 300.5;
        precios[2] = 129.99;
        precios[3] = 499.0;
        precios[4] = 90.0;
        
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio: $" + precios[i]);
        }
    }
    
}
