package justtestingoficial;
import java.util.Scanner;


public class Guia2_Ejercicio3{
    /*
    Elaborar un programa que realice la opción seleccionada
    de acuerdo a lo siguiente:
    a.- Área del triángulo (Solicitar base y altura)
    b.- Área del Cuadrado (Solicitar lado)
    c.- Área del Círculo (Solicitar radio)
    d.- Área del Rectángulo (Solicitar base y altura)
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        float total;
        int seguir;
        do{
            System.out.println("Presione a para calcular el area de un triángulo");
            System.out.println("Presione b para calcular el area de un cuadrado");
            System.out.println("Presione c para calcular el area de un círculo");
            System.out.println("Presione d para calcular el área de un rectángulo");
            String opcion = lector.next();
            
            switch(opcion){
                
                case "a":
                    System.out.println("Ingrese la base del triángulo");
                    float base = lector.nextFloat();
                    System.out.println("Ingrese la altura del triángulo");
                    float altura = lector.nextFloat();
                    total = (base*altura) / 2;
                    System.out.println("El área del triángulo es: " + total);
                    break;
                
                case "b":
                    System.out.println("Ingrese el lado del cuadrado");
                    float lado = lector.nextFloat();
                    total = lado * lado;
                    System.out.println("El área del cuadrado es: " + total);
                    break;
                
                case "c":
                    System.out.println("Ingrese el radio del círculo");
                    float radio = lector.nextFloat();
                    total = (float)3.14 * (radio*radio);             
                    System.out.println("El área del círculo es: " + total);
                    break;
                    
                case "d":
                    System.out.println("Ingrese la base del rectángulo");
                    float base_r = lector.nextFloat();
                    System.out.println("Ingrese la altura del rectángulo");
                    float altura_r = lector.nextFloat();
                    total = base_r * altura_r;
                    System.out.println("El área del rectángulo es: " + total);
                    break;
                    
                default:
                    System.out.println("El valor ingresado es incorrecto");
                        
            }
            System.out.println("Presione 1 para continuar, 0 para finalizar");
            seguir = lector.nextInt();
        }
        while(seguir == 1);
      
        
    }       
           
}
    

