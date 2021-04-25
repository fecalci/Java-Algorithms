package justtestingoficial;
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        /*
        2. Leer tres valores numéricos enteros, indicar cual es el mayor, cual
        es el del medio y cual el menor. Considerar que los tres valores son
        diferentes.
        */
        /*
        int mayor = 0;
        int menor = 0;
        int medio = 0;
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese el primer valor numérico");
        int num_a = lector.nextInt();
        System.out.println("Ingrese el segundo valor numérico");
        int num_b = lector.nextInt();
        System.out.println("Ingrese el tercer valor numérico");
        int num_c = lector.nextInt();
        
        if(num_a > num_b){
            if(num_a > num_c){
                mayor = num_a;
                if(num_b > num_c){
                    medio = num_b;
                    menor = num_c;
                }
                else{
                    medio = num_c;
                    menor = num_b;
                }
            }
            else{
                mayor = num_c;
                medio = num_a;
                menor = num_b;
            }        
        }
        else if(num_b > num_a){
            if (num_b > num_c){
                mayor = num_b;
                if (num_c > num_a){
                    medio = num_c;
                    menor = num_a;
                }
            }
            else{
                mayor = num_c;
                medio = num_b;
                menor = num_a;
            }
        }
        System.out.println("El mayor es:" + mayor);
        System.out.println("El medio es:" + medio);
        System.out.println("El menor es:" + menor);
        }  */  
    
    String sexo="M";  
    char new_sexo =sexo.charAt(0);
    System.out.println(new_sexo);
    }
} 

