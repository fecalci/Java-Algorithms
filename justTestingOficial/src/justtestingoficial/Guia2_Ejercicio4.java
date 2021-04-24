package justtestingoficial;
import java.util.Scanner;


public class Guia2_Ejercicio4{
    /*
    Elaborar un menú con las siguientes opciones:
    1 Cubo de un número
    2 Numero par o impar
    3 Numero primo
    4 Factorial de un número
    5 Número mayor o menor
    6 Tabla de multiplicar
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int total = 0;
        int seguir;
        do{
            System.out.println("Ingrese un número");
            int num = lector.nextInt();
            System.out.println("Presione 1 para calcular el cubo del número");
            System.out.println("Presione 2 para determinar si el número es par o impar");
            System.out.println("Presione 3 para determinar si el número es primo");
            System.out.println("Presione 4 para calcular factorial del número");
            System.out.println("Presione 5 para calcular determinar si es mayor o menor que otro número");
            System.out.println("Presione 6 para calcular la tabla de multiplicar del número");
            int opcion = lector.nextInt();
            
            switch(opcion){
                
                case 1:
                    total = num * num * num;
                    System.out.println("El cubo de "+num+" es: "+ total);
                    break;
                
                case 2:
                    if(num%2 != 0){
                        System.out.println(num + " es impar");
                    }
                    else{
                        System.out.println(num + " es par");
                    }
                    break;
                
                case 3:
                    boolean primo = true;
                    for(int i = 2; i < num; i++){
                        if(num % i == 0){
                            primo = false;
                            System.out.println("El número NO es primo");
                            break;
                        }
                    }
                    if(primo == true){
                        System.out.println("El número es primo");
                    }                   
                    break;
                    
                case 4:
                    total = 1;
                    for(int i = 1; i<=num; i++){
                        total = total * i;
                    }
                    System.out.println("El factorial de "+num+" es: "+total);
                    break;
                
                case 5:
                    System.out.println("Ingrese el número a comparar");
                    int num2 = lector.nextInt();
                    if (num > num2){
                        System.out.println(num +" es mayor que "+num2);               
                    }
                    if(num< num2){
                        System.out.println(num +" es menor que "+num2);
                    }
                    else{
                        System.out.println("Los números ingresados son iguales");
                    }
                    break;
                
                case 6:
                    for(int i = 1; i!=11;i++){
                        total = 0;
                        total = num * i;
                        System.out.println(num + "x" + i + "= " + total);
                    }
                    break;
                    
                default:
                    System.out.println("El valor ingresado es incorrecto");
                    break;
                        
            }
            System.out.println("Presione 1 para continuar, 0 para finalizar");
            seguir = lector.nextInt();
        }
        while(seguir == 1);
      
        
    }       
           
}
    

