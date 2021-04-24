package justtestingoficial;
import java.util.Scanner;


public class Guia3_Ejercicio5{
    /*
    Realizar un programa que permita la carga por teclado de 15
    números en un vector. Una vez cargados, se necesita que el
    programa cuente e informe por pantalla cuántas veces se cargó un
    número x que se pedirá que sea ingresado.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double numeros [] = new double[15];
        int veces = 0;
        
        for(int i = 0;i<15;i++){
            System.out.println("Ingrese un número");
            double num = lector.nextDouble();
            numeros[i] = num;
        }
        System.out.println("Ingrese un número para saber cuantas veces se cargó");
        double check_num = lector.nextDouble();
        for(int i = 0;i<15;i++){
            if(check_num == numeros[i]){
                veces++;
            }
        }
        System.out.println("El número " +check_num+" se ingresó "+veces+" veces");        
        
    }
        
}       
               

