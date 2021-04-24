package justtestingoficial;
import java.util.Scanner;


public class UNO_POO_CLASE_EJ1_PAG11 {
    /*
    1. Desarrollar un programa que le permita al usuario ingresar un
    conjunto de 10 valores enteros. Luego se debe imprimir el conjunto
    que el usuario ingresó, primero en el orden original y luego en el
    inverso. Por ejemplo, si el usuario ingresa: 12, 43, 5, 26, 7, 98, 1, 32,
    18, 9 la salida del programa debe ser la siguiente:
     Orden original: 12 43 5 26 7 98 1 32 18 9
     Orden inverso: 9 18 32 1 98 7 26 5 43 12
    */
    public static void main(String[] args) {
    Scanner lector = new Scanner (System.in);
    int numeros_a [] = new int [10];
    int numeros_b [] = new int [10];
    int cont = 9;
    
        for(int i = 0;i<10;i++){
            System.out.println("Ingrese el valor número "+(i+1));
            int num = lector.nextInt();
            numeros_a[i] = num;
            numeros_b[cont] = num;
            cont--;
        }
        System.out.print("Orden original: ");
        for(int i = 0;i<numeros_a.length;i++){
            System.out.print(numeros_a[i] + " ");
        }
        System.out.println("");
        System.out.print("Orden inverso: ");
        for(int i = 0;i<numeros_a.length;i++){
            System.out.print(numeros_b[i] + " ");          
        }        
        
        
    }
    
}
