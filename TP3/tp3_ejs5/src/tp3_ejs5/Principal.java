/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ejs5;

/**
 *
 * @author Geronimo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial();
        nave.nombre = "Enterprise";
        
        nave.mostrarEstado();
        nave.despegar();
        
        nave.avanzar(20);
        nave.recargarCombustible(10);
        
        nave.avanzar(20);
        nave.mostrarEstado();
    }   
}
