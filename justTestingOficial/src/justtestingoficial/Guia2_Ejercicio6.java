package justtestingoficial;
import java.util.Scanner;


public class Guia2_Ejercicio6{
    /*
    Determinar si un número es perfecto (un número es
    perfecto si es igual a la suma de todos sus divisores
    positivos sin incluir el propio número) Ejemplo: 6 es
    divisible entre 1, 2, 3 y el mismo (pero este no se
    cuenta como divisor) si sumamos 1 + 2 +3 = 6. El 6 es un
    número perfecto.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int num = 0;
        int total = 0;
        do {
            
           System.out.print("Ingrese un número para comprobar si es perfecto");                                                 
           num = lector.nextInt();
           
        } while (num < 0 );     
        
        for(int i = 1; i< num; i++){
            
            if(num % i == 0){
                total = total + i;
            }            
        }
        
        if(num == total){
            System.out.println("El número es PERFECTO");
        }
        else{
            System.out.println("El número  no es PERFECTO");
        }
        
    }       
           
}
    

