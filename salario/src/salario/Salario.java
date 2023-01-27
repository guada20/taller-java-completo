/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //crear un programa que le permita al usuario ingesar el tipo de trabajador (Fijo o temporal
        //y con base en esto pueda imprimir el nombre
        //y el salrio neto sabiendo que 
        //1. si es fijo debe leer el nombre, nuemro de hora trabajadas, el salrio basico hora
        //total deducciones y el total de bonificaciones y
        //si es temporal solo debe leer el nombre y el numero de horas trabajadas
        //estos trabajadores tienen un salario basico fijo de 60.000
        //y no tienen bonificaciones ni deducciones
        
        Scanner Lea = new Scanner(System.in);
        String Tipotrabajador;
        String Nombre;
        int Horastrabajadas;
        double Salariohora,Deducciones,Bonificaciones,totalsalario,salariotempo;
        System.out.println("Ingrese el tipo de trabajador (Fijo o temporal");
        Tipotrabajador=Lea.nextLine();
        
        if("fijo".equals(Tipotrabajador)){
            System.out.println("Ingrese su Nombre");
            Nombre=Lea.nextLine();
            System.out.println("Ingrese cantidad de horas trabajadas");
            Horastrabajadas=Lea.nextInt();
            System.out.println("Ingrese el salario basico por hora");
            Salariohora=Lea.nextDouble();
            System.out.println("Ingrese el total de deducciones");
            Deducciones=Lea.nextDouble();
            System.out.println("Ingrese el total de bonificaciones");
            Bonificaciones=Lea.nextDouble();
            
            totalsalario=((Horastrabajadas*Salariohora)+Bonificaciones)-(Deducciones);
            System.out.println(Nombre+" su salario total es "+totalsalario);
        }else{
            System.out.println("Ingrese su Nombre");
            Nombre=Lea.nextLine();
            System.out.println("Ingrese cantidad de horas trabajadas");
            Horastrabajadas=Lea.nextInt();
            salariotempo=(Horastrabajadas*60000);
            System.out.println(Nombre+" su salario total es "+salariotempo);
        }
        
        
        
    }
    
}
