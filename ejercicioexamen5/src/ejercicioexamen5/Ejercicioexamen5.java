/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamen5;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Ejercicioexamen5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Lea = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int suma;
       
         System.out.println("Ingrese el primer numero ");
         numero1=Lea.nextInt();
          System.out.println("Ingrese el segundo numero ");
         numero2=Lea.nextInt();
          System.out.println("Ingrese el tecer numero");
         numero3=Lea.nextInt();
          System.out.println("Ingrese el cuarto numero ");
         numero4=Lea.nextInt();
          System.out.println("Ingrese el quinto numero ");
         numero5=Lea.nextInt();
         suma=(numero1+numero2+numero3+numero4+numero5);
         
          System.out.println("la suma total de los numeros es " +suma );
    }

    private static void suma(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
