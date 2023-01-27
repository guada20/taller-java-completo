/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamen3;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Ejercicioexamen3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Lea = new Scanner(System.in);
         String Nombre;
         String Mescompra;
         double Valorcompra, descuento,total;
         
        System.out.println("Ingrese su nombre porfavor ");
        Nombre=Lea.nextLine();
        System.out.println("Ingrese el mes en que se realizo la compra ");
        Mescompra=Lea.nextLine();
        System.out.println("Ingrese el valor de la compra ");
        Valorcompra=Lea.nextDouble();
        descuento=(Valorcompra*0.15);
        total=(Valorcompra-descuento);
        
        if("junio".equals(Mescompra)){
            System.out.println("El valor total de su compra tendria un descuento del 15% y el total es " +total);
        }else{
            System.out.println("Su compra no tiene descuento");
        }
    }
    
}
