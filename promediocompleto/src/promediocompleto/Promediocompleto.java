/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promediocompleto;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Promediocompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String Nombre;
        double ValorCompra;
        double DCTO1;
        double Total1;
        
              
        
        Scanner Lea = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        Nombre=Lea.nextLine();
        System.out.println("Ingrese el valor de la compra");
        ValorCompra=Lea.nextDouble();
        
        if(ValorCompra > 300.000){
            DCTO1 =ValorCompra*0.20;
           Total1 = ValorCompra-DCTO1;
           System.out.println("Hola" +Nombre+ "Su descuento es " +DCTO1);
           System.out.println(Nombre+ " El total de tu factura es " +Total1);
    
        }else{
            DCTO1 = ValorCompra*0.10;
            Total1 = ValorCompra-DCTO1;
            System.out.println("Hola" +Nombre+ "Su descuento es " +DCTO1);
           System.out.println(Nombre+ " El total de tu factura es " +Total1);
           
        }
    }
    
}
