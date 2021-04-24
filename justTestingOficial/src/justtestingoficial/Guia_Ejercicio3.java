package justtestingoficial;
import java.util.Scanner;


public class Guia_Ejercicio3 {
    public static void main(String[] args) {
        /*
        Realizar un programa que permita intercambiar el valor de dos variables.
        Por ejemplo, si la variable1 vale 5 y la variable2 vale 12, hacer que la
        variable1 valga 12 y la variable2 valga 5. Tener en cuenta que al asignar
        un valor a una variable se sobrescribe el valor anterior.
        */
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingresar la variable 1");
        int var1 = lector.nextInt();
        System.out.println("Ingresar la variable 2");
        int var2 = lector.nextInt();
        int aux = var2;
        var2 = var1;
        var1 = aux;
        System.out.println("Variable 1 ahora es: " + var1);
        System.out.println("Variable 2 ahora es: " + var2);
    }
    }
    

