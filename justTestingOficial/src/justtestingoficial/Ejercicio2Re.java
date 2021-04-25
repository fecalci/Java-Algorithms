package justtestingoficial;
import java.util.Scanner;


public class Ejercicio2Re {
    public static void main(String[] args) {
        /*
        2. Leer tres valores numéricos enteros, indicar cual es el mayor, cual
        es el del medio y cual el menor. Considerar que los tres valores son
        diferentes.
        */
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese el primer valor numérico");
        int num_a = lector.nextInt();
        System.out.println("Ingrese el segundo valor numérico");
        int num_b = lector.nextInt();
        System.out.println("Ingrese el tercer valor numérico");
        int num_c = lector.nextInt();
        
        if(num_a > num_b && num_a > num_c && num_b > num_c){
            System.out.println("El mayor es "+num_a);
            System.out.println("El medio es "+num_b);
            System.out.println("El menor es "+num_c);
        }
        else if(num_a>num_b && num_a > num_c && num_c > num_b){
            System.out.println("El mayor es "+num_a);
            System.out.println("El medio es "+num_c);
            System.out.println("El menor es "+num_b);                       
        }
        else if(num_b > num_a && num_b > num_c && num_a > num_c){
            System.out.println("El mayor es "+num_b);
            System.out.println("El medio es "+num_a);
            System.out.println("El menor es "+num_c);            
        }
        else if(num_b > num_a && num_b > num_c && num_c > num_a){
            System.out.println("El mayor es "+num_b);
            System.out.println("El medio es "+num_c);
            System.out.println("El menor es "+num_a);            
        }
        else if(num_c> num_a && num_c > num_b && num_a > num_b){
            System.out.println("El mayor es "+num_c);
            System.out.println("El medio es "+num_a);
            System.out.println("El menor es "+num_b);            
        }
        else if(num_c > num_a && num_c > num_b && num_b > num_a){
            System.out.println("El mayor es "+num_c);
            System.out.println("El medio es "+num_b);
            System.out.println("El menor es "+num_a);            
        }

        }  
    
    }
 

