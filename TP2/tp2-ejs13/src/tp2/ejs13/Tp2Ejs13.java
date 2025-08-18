/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs13;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        
        recursiva(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios Modificados:");
        recursiva(precios, 0);
        
    }
    public static void recursiva(double[] arr, int indice){
        if (indice >= arr.length) {
            return;
        }
        
        System.out.println("Precio: $" + arr[indice]);
        recursiva(arr, indice + 1);
    }
}
