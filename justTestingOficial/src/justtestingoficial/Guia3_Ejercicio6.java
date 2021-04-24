package justtestingoficial;
import java.util.Scanner;


public class Guia3_Ejercicio6{
    /*
    Un empleado desea almacenar en un vector sus 12 sueldos del año.
    A partir de esa carga, necesita un programa que determine y
    muestre por pantalla la suma total de sus 12 sueldos y el
    promedio de sueldo que tuvo en el año.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double sueldos [] = new double[12];
        double total = 0;
        double promedio = 0;
        
        for(int i = 0;i<12;i++){
            System.out.println("Ingrese el sueldo del mes "+(i+1));
            double sueldo = lector.nextDouble();
            if(sueldo>=0){
                sueldos[i] = sueldo;
                total = total + sueldo;
            }
            else{
                System.out.println("El sueldo ingresado es incorrecto");
                i--;
            }
        }
        System.out.println("El total de los sueldos del año es: "+total);
        promedio = total/12;
        System.out.println("El promedio de los sueldos del año es: "+promedio);
        
        
    }
        
}       
               

