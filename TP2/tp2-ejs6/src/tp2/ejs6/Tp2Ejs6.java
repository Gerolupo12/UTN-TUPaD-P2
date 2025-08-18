/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2.ejs6;

import java.util.Scanner;

/**
 *
 * @author Geronimo
 */
public class Tp2Ejs6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int cpo = 0;
        int cne = 0;
        int cce = 0;
        
        for (int i = 1; i < 11; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            num = scan.nextInt();  
            if(num > 0){
                cpo++;
            } else if (num < 0){
                cne++;
            }else{
                cce++;
            }
        }
        System.out.println("Resultados: ");
        System.out.println("Positivos: " + cpo);
        System.out.println("Negativos: " + cne);
        System.out.println("Ceros: " + cce);
    }
    
}
