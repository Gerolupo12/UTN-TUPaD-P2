/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ejs5;

/**
 *
 * @author Geronimo
 */
public class NaveEspacial {
    String nombre;
    double combustible = 50;
    
    public void despegar() {
        if (combustible >= 0) {
            System.out.println(nombre + " ha despegado.");
        } else {
            System.out.println(nombre + " no hay suficiente combustible.");
        }
    }

    public boolean avanzar(double distancia) {
        double combustibleNecesario = distancia;
        if (combustible >= combustibleNecesario) {
            combustible -= combustibleNecesario;
            System.out.println(nombre + " ha avanzado " + distancia + " km");
        } else {
            System.out.println(nombre + " no hay suficiente combustible para avanzar " + distancia + " km");

        }
        return false;
    }

    public void recargarCombustible(double cantidad) {
        double nuevoCombustible = combustible + cantidad;
        if (nuevoCombustible <= 50) {
            combustible = nuevoCombustible;
            System.out.println("Combustible recargado. Total: " + combustible);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible);
    }
}
