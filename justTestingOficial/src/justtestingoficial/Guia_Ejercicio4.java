package justtestingoficial;
import java.util.Scanner;


public class Guia_Ejercicio4 {
    public static void main(String[] args) {
        /*
        Una pequeña despensa desea calcular los sueldos de sus empleados. Los
        puestos de los mismos pueden tener 3 categorías: 1- repositor, 2-cajero
        y 3-supervisor.
        a) Los repositores cobran $15.890 + un bono de 10%.
        b) Los cajeros cobran $25.630,89 fijos.
        c) Los supervisores cobran $35.560,20 en bruto al cual se les descuenta
        un 11% de jubilación.
        Se necesita un programa que, dependiendo el tipo de empleado del que se
        trate, calcule y muestre en pantalla el correspondiente sueldo.
        */
        double sueldo = 0;
        Scanner lector = new Scanner (System.in);
        System.out.println("Escriba 1 si el empleado es repositor, 2 si es cajero, 3 si es supervisor");
        int empleado = lector.nextInt();
        if(empleado == 1){
           sueldo = 15890 + (15890*0.10);            
        }
        if(empleado == 2){
           sueldo = 25630.89;            
        }
        if(empleado == 3){
           sueldo = 35560.20 - (35560.20*0.11);            
        }        
        System.out.println("El sueldo del empleado es: " + sueldo);
        
    }
    }
    

