/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tps_ejs3;

/**
 *
 * @author Geronimo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro lib1 = new Libro();
       
        lib1.setAnioPublicacion(-123);
        lib1.mostrarInfo();
        lib1.setAnioPublicacion(1970);
        lib1.mostrarInfo();
    }
    
}
