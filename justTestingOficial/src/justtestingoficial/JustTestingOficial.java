package justtestingoficial;
import java.util.Scanner;

public class JustTestingOficial {
  

    public static void main(String[] args) {
        /*
        1. Leer dos valores numéricos enteros e indicar cual es el mayor y
        cual es el menor. Considerar que ambos valores son diferentes.
        */
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese el primer valor numérico");
        int num_a = lector.nextInt();
        System.out.println("Ingrese el segundo valor numérico");
        int num_b = lector.nextInt();
        if (num_a > num_b){
            System.out.println("El primer número es mayor");
        }
        else{
            System.out.println("El segundo número es mayor");
        }
        }
}
    
