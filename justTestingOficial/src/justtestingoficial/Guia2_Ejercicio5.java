package justtestingoficial;
import java.util.Scanner;


public class Guia2_Ejercicio5{
    /*
    Ingresar un número por teclado y comprobar si este es
    capicúa(un numero capicúa es aquel que se lee igual de
    derecha a izquierda y viceversa) Ejemplo 2002
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int num;
        int aux;
        int digito;
        int inverso = 0;
        do {
            
           System.out.print("Ingrese un número para comprobar si es capicúa");                                                 
           num = lector.nextInt();
           
        } while (num < 0 );     
        
        aux = num;
        while (aux!=0){
            digito = aux % 10;
            inverso = inverso * 10 + digito;
            aux = aux / 10;
        }        
        
        if(num == inverso){
            System.out.println("El número ingresado es capicúa");
        }
        else{
            System.out.println("El número ingresado no es capicúa");
        }

      
        
    }       
           
}
    

