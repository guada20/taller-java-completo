/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamen4;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Ejercicioexamen4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Lea = new Scanner(System.in);
         int minutos,valor5,valormas,valormasmin,valortotal;
         System.out.println("Ingrese la cantidad de minutos de la llamada ");
         minutos=Lea.nextInt();
         valor5=(200);
         valormas=(minutos-5);
         valormasmin=(valormas*150);
         valortotal=(valormasmin+200);
         
         if (minutos>5){
             System.out.println("el valor total a pagar seria " +valortotal);
         }else{
             System.out.println("Debe pagar  " +valor5);
         }
    }
    
}
