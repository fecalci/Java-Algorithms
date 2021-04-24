package justtestingoficial;
import java.util.Scanner;


public class Clase{
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int seguir;
        
        do{
 
            System.out.println("Ingrese el primer número");
            int num1 = lector.nextInt();
            System.out.println("Ingrese el segundo número");
            int num2 = lector.nextInt(); 
            System.out.println("Ingrese el tipo de operación que quiere realizar");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Division");
            System.out.println("4- Multiplicacion");
            System.out.println("5- Modulo");
            int operacion = lector.nextInt();

            
            switch(operacion){
                case 1:
                    System.out.println("La suma de los números es: " + (num1 + num2));
                    break;

                case 2: 
                    System.out.println("La resta de los números es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("La división de los números es: " + (num1 / num2));
                    break;

                case 4: 
                    System.out.println("La multiplicación de los números es: " + (num1 * num2));
                    break;

                case 5:
                    System.out.println("El módulo de los números es: " + (num1 % num2));
                    break;

                default:
                    System.out.println("El número ingresado es incorrecto");
                    break;
            }
            
            System.out.println("Presione 1 para continuar, 0 para salir");
            seguir = lector.nextInt();
        
        }
        
        while(seguir == 1);
        System.out.println("Gracias por usar el sistema, hasta luego!");
            
    }
}
    

