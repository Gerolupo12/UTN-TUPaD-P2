/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tps_ejs3;

/**
 *
 * @author Geronimo
 */
public class Libro {
    private String titulo, autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 && anioPublicacion <= 2024) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Anio de publicacion invalido: " + anioPublicacion);
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Anio de publicacion: " + anioPublicacion);
    }
}
