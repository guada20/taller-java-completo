/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejericioexamen6;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Ejericioexamen6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Lea = new Scanner(System.in);
         int radio;
         double area;
         System.out.println("Ingrese el radio del circulo en cm ");
         radio=Lea.nextInt();
         area=3.14 * (radio*radio);
          System.out.println("el area total del circulo es  " +area);
    }
    
}
