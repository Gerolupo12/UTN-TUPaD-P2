/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ejs2;

/**
 *
 * @author Geronimo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota m1 = new Mascota();
        
        m1.nombre = "Pipa";
        m1.especie = "Labrador";
        m1.edad = 3;
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();
    }
    
}
