/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //crear un programa que pida 3 notas y muestre el promedio 
        
      //1. crear las variables necesarias
      String Nombre;
      float nota1, nota2, nota3,promedio;
      //2.llmar al scanner
      Scanner lea= new Scanner(System.in);
      //3.pedir los datos de entrada que pide el algoritmo 
      System.out.println("ingrese el nombre del estudiante");
      Nombre=lea.nextLine();
      System.out.println("ingrese el valor de la primera nota");
      nota1=lea.nextFloat();
      System.out.println("ingrese el valor de la segunda nota");
      nota2=lea.nextFloat();
      System.out.println("ingrese el valor de la tercera nota");
      nota3=lea.nextFloat();
      //4.proceso
      promedio=(nota1+nota2+nota3)/3;
      //5. mostrar el resultado(datos de salida )
      System.out.println("el estudiante "+Nombre+ " tiene un promedio de: " +promedio );
      //6. comprobar si gano o perdio la materia
      
      if(promedio>=3.0){
          System.out.println("El estudiante "+Nombre+ " gano la materia con un promedio de: "+promedio);
          
      }
      else{
          System.out.println("el estudiante "+Nombre+" perdio la materia con un promedio de: "+ promedio);
      }
    }
    
}
