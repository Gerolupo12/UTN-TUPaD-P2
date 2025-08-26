/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ejs4;

/**
 *
 * @author Geronimo
 */
public class Gallina {
    int idGallina, edad, huevosPuestos;
    
    public void ponerHuevo() {
        if (edad > 0) {
            huevosPuestos++;
            System.out.println("Gallina " + idGallina + " ha puesto un huevo. Total: " + huevosPuestos);
        } else {
            System.out.println("Gallina " + idGallina + " es demasiado joven para poner huevos");
        }
    }

    public void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ha envejecido. Ahora tiene " + edad + " anios");
    }

    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }

}
