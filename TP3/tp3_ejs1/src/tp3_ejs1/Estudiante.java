/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ejs1;

/**
 *
 * @author Geronimo
 */
public class Estudiante {
    String nombre, apellido, curso;
    int calificacion;
    
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Calificacion aumentada a: " + calificacion);
    }

    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        System.out.println("Calificacion disminuida a: " + calificacion);
    }
}

