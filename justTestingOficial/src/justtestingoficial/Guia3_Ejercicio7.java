package justtestingoficial;
import java.util.Scanner;


public class Guia3_Ejercicio7{
    /*
    En tres vectores diferentes se guardan los datos de temperaturas
    máximas y mínimas de 5 ciudades de Misiones. En el primer vector
    se guardan los nombres de las ciudades, en el segundo las
    temperaturas mínimas alcanzadas y en el tercero las temperaturas
    máximas alcanzadas en la última semana. Se necesita un programa
    que permita la carga de las ciudades, sus temperaturas mínimas y
    máximas; además, deberá poder informar por pantalla cual fue la
    ciudad con la temperatura más baja y cual con la temperatura más
    alta (dando a conocer al mismo tiempo la cantidad de grados).
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        String ciudades [] = new String[5];
        double minimas [] = new double[5];
        double maximas [] = new double[5];
        double max = 0;
        int pos_max = 0;
        double min = 99;
        int pos_min = 0;
        
        for(int i = 0;i<5;i++){
            System.out.println("Ingrese el nombre de la ciudad");
            String ciudad = lector.nextLine();
            ciudades[i] = ciudad;
            System.out.println("Ingrese la temperatura mínima");
            double minima = lector.nextDouble();
            minimas[i] = minima;
            System.out.println("Ingrese la temperatura máxima");
            double maxima = lector.nextDouble();
            String saltodelinea = lector.nextLine();
            maximas[i] = maxima;
            
            if (minima < min){
                min = minima;
                pos_min = i;
            }
            
            if(maxima > max){
                max = maxima;
                pos_max = i;
                
            }
        }
        System.out.println("La ciudad con mayor temperatura fue "+ciudades[pos_max]+ " con una temperatura de "+max+" grados");
        System.out.println("La ciudad con menor temperatura fue "+ciudades[pos_min]+" con una temperatura de "+min+" grados");
    }
        
        
}
        
       
               

