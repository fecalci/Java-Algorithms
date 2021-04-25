package justtestingoficial;
import java.util.Scanner;


public class Guia3_Ejercicio4{
    /*
    Realizar un programa que lea una oración, luego reciba una
    palabra y me diga cuantas veces se encuentra la misma dentro de
    la oración.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese una oración");
        String oracion = lector.nextLine();
        System.out.println("Ingrese una palabra a buscar");
        String palabra = lector.next();
        int aparicion = 0;
        String oracion_separada [] = oracion.split(" ");
        
        for(int i = 0;i<oracion_separada.length;i++){
            if(oracion_separada[i].equalsIgnoreCase(palabra)){
                aparicion = aparicion + 1;
            }
        }
        System.out.println("La palabra "+ palabra+" apareció "+aparicion+" veces");
        
    }
        
}       
               

