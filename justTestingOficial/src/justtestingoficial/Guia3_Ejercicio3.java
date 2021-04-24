package justtestingoficial;
import java.util.Scanner;


public class Guia3_Ejercicio3{
    /*
    Leer el nombre y sueldo de 20 empleados y mostrar el nombre y
    sueldo del empleado que más gana.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        String nombres [] = new String[3];
        double sueldos [] = new double[3];
        double max = 0; 
        int emp = 0;
        
        for(int i = 0;i<3;i++){
            System.out.println("Ingrese el nombre del empleado");
            String nombre = lector.next();
            System.out.println("Ingrese el sueldo del empleado");
            double sueldo = lector.nextDouble();
            if(sueldo>=0){
                sueldos[i] = sueldo;
                nombres[i] = nombre;
                if(sueldo>max){
                    max = sueldo;
                    emp = i;
                }
            }
            else{
                System.out.println("El sueldo ingresado es incorrecto");
                i--;
            }                       
            
        }
        System.out.println("El empleado que más gana es "+ nombres[emp]+" con un sueldo de "+sueldos[emp]);
    }
        
}       
               

