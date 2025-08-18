/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs9;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precio, peso, envio, preciofinal;
        String zona;
        
        System.out.print("Ingrese el precio del producto: ");
        precio = Integer.parseInt( scan.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg:  ");
        peso = Integer.parseInt( scan.nextLine());
        
        System.out.print("Ingrese la zona de envio (Nacional/Internacional):  ");
        zona = scan.nextLine();
        
        envio = calcularCostoEnvio(peso, zona);
        preciofinal = calcularTotalCompra(precio, envio);
        
        System.out.println("El costo de envio es: " + envio);
        System.out.println("El total a pagar es: " + preciofinal);
        
    }
    
    static double calcularCostoEnvio(double peso, String zona){ 
        double envio;
        if ("Nacional".equals(zona)) {
            envio = peso * 5;
        }else {
            envio = peso * 10;
        }
        return envio;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        double pfinal;
        pfinal = precioProducto + costoEnvio;
        return pfinal;
    }
    
    
}
