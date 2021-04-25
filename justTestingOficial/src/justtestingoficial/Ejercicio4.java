package justtestingoficial;
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        /*
        4. Se ingresa por teclado un conjunto de valores numéricos enteros
        positivos, se pide informar, por cada uno, si el valor ingresado es
        par o impar. Para indicar el final se ingresará un valor cero o
        negativo.
        */
        System.out.println("Ingrese un número");
        Scanner lector = new Scanner (System.in);
        int num = lector.nextInt();
        if (num%2 == 0){
            System.out.println("El número ingresado es par");
        } 
        else{
            System.out.println("El número ingresado es impar");
        }
    }
    }
    

