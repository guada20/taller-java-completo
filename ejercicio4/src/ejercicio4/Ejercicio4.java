/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
        //crear un programa que indique si una pérsona es apta o no para un equipo
        //de baloncesto para ser apto debe cumplir las siguientes coondiciones
        //1. si es hombre debe de ser mayor de edad, medir mas de 1.70 y que pese menos de 75kg
        //2. si es mujer que tenga mas de 16 años, que mida minimo 1.70 y que pese maximo 60kg
        
        
        String Nombre;
        String Sexo;
        int Edad;
        float Estatura;
        int Peso;
        
        Scanner Lea = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        Nombre=Lea.nextLine();
        System.out.println("Ingrese su sexo, M para masculino y F para femenino");
        Sexo=Lea.nextLine();
        System.out.println("Ingrese su Edad por favor");
        Edad=Lea.nextInt();
        System.out.println("Ingrese su estatura por favor");
        Estatura=Lea.nextFloat();
        System.out.println("Ingrese su peso en kg por favor");
        Peso=Lea.nextInt();
       
        
        if(("m".equals(Sexo))&&(Edad>=18)&&(Estatura>1.70)&&(Peso<75)){
          System.out.println(Nombre+ " Eres apto para el equipo de baloncesto");
        }else if(("f".equals(Sexo))&&(Edad>16)&&(Estatura>=1.70)&&(Peso<=60)){
            System.out.println(Nombre+ " Eres apta para el equipo de baloncesto");
        }else{
            System.out.println(Nombre+" No eres apto para el equipo de baloncesto");
        }
    }
    
}
