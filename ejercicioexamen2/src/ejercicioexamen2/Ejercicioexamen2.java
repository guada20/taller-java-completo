/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamen2;

/**
 *
 * @author Laboratorio
 */
import java.util.Scanner;
public class Ejercicioexamen2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Lea = new Scanner(System.in);
        String Placa1;
        String Placa2;
        int Numeropasa1;
        int Numeropasa2;
        double Valorpasaje,bus1,bus2;
        System.out.println("Ingrese la placa del primer bus ");
        Placa1=Lea.nextLine();
        System.out.println("Ingrese la placa del segundo bus ");
        Placa2=Lea.nextLine();
        System.out.println("Ingrese el numero de pasajeros del bus 1");
        Numeropasa1=Lea.nextInt();
        System.out.println("Ingrese el numero de pasajeros del bus 2");
        Numeropasa2=Lea.nextInt();
        System.out.println("Ingrese el valor del pasaje");
        Valorpasaje=Lea.nextDouble();
        bus1=(Valorpasaje*Numeropasa1);
        bus2=(Valorpasaje*Numeropasa2);
        if(bus1>bus2){
            System.out.println("El bus que mas dinero recogio es "+Placa1+ " con un total de " +bus1);
        }else if (bus2>bus1){
            System.out.println("El bus que mas dinero recogio es "+Placa2+ " con un total de " +bus2);
        }else{
            System.out.println("El bus  "+Placa2+ " y el bus " +Placa1+" recogieron la misma cantidad de dinero con un total de " +bus2);
        }
    
                
    }
    
}
