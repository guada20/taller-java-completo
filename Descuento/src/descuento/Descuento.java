/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuento;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**crear un programa que pida el valor de la compra, si esta es mayor a 600.000 se le 
         * dara un descuento del 20%, de lo contrario se dara un descuento del 10%
         * mostrar el valor del descuento y el total a pagar
         */
       float valCompra,Descuento1,Descuento2,totalPagar1,totalPagar2;
       Scanner lea= new Scanner(System.in);
         System.out.println("ingrese el valor de la compra");
         valCompra=lea.nextFloat();
         Descuento1=valCompra*(20/100);
         Descuento1=lea.nextFloat();
         Descuento2=valCompra*(10/100);
         Descuento2=lea.nextFloat();
         totalPagar1=valCompra-Descuento1;
         totalPagar1=lea.nextFloat();
         totalPagar2=valCompra-Descuento2;
         totalPagar2=lea.nextFloat();
         
         if(valCompra>600.000){
          System.out.println("su total a pagar es: "+totalPagar1+ " obteniendo un descuento del 20% el cual tiene un valor de: "+Descuento1 );
       
         }else{
                   System.out.println("su total a pagar es: "+totalPagar2+ " obteniendo un descuento del 10% el cual tiene un valor de: "+Descuento2 );
         }
    }
    
}
