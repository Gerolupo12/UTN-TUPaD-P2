/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ejs2;

/**
 *
 * @author Geronimo
 */
public class Mascota {
    String nombre, especie;
    int edad;
    
    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
    }
    
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ha cumplido anios. Ahora tiene " + edad + " anios");
    }
}
