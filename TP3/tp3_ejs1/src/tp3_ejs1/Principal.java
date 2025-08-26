/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ejs1;

/**
 *
 * @author Geronimo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        
        est1.apellido = "Ramallo";
        est1.nombre = "Geronimo";
        est1.curso = "5 grado";
        est1.calificacion = 6;
        
        est1.mostrarInfo();
        est1.subirCalificacion(3);
        est1.mostrarInfo();
        est1.bajarCalificacion(2);
        est1.mostrarInfo();
    }
    
}
