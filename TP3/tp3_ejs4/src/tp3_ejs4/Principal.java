/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ejs4;

/**
 *
 * @author Geronimo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina gallo1 = new Gallina();
        Gallina gallo2 = new Gallina();
        
        gallo1.idGallina = 1;
        gallo2.idGallina = 2;
        
        gallo1.ponerHuevo();
        gallo2.ponerHuevo();
        
        gallo1.envejecer();
        gallo2.envejecer();
             
        gallo1.mostrarEstado();
        gallo2.mostrarEstado();
        
        gallo1.envejecer();
        gallo2.envejecer();
        
        gallo1.ponerHuevo();
        gallo2.ponerHuevo();
        
        gallo1.mostrarEstado();
        gallo2.mostrarEstado();
    }
    
}
