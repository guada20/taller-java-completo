/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamen1;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class EjercicioExamen1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner lea = new Scanner(System.in);
    int numero;
    System.out.println("Ingrese un numero entero");
    numero=lea.nextInt();
    
    if(numero<0){
         System.out.println("el numero "+numero+ " es negativo");
    }else if(numero>0){
        System.out.println("el numero "+numero+ " es positivo");
    }else{
        System.out.println("el numero "+numero+ " es cero");
    }
    }
    
}
