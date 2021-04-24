package justtestingoficial;
import java.util.Scanner;


public class Guia3_Ejercicio2{
    /*
    Se desea guardar en un arreglo de n tamaño 10 números enteros
    positivos y negativos. Mostrar por pantalla la suma de los
    números positivos y negativos, además del promedio de cada uno
    de ellos.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese el tamaño del arreglo");
        int tam = lector.nextInt();
        int arr[] = new int[tam];
        double pos = 0;
        double cant_pos = 0;
        double neg = 0;
        double cant_neg = 0;
        double total = 0;
        double promedio_pos = 0;
        double promedio_neg = 0;
       
        for(int i =0; i<tam;i++){
            
            System.out.println("Ingrese un número entero");
            int num = lector.nextInt();
            if(num> 0){
                pos = pos + num; 
                cant_pos++;
                arr[i] = num;
            }
            else if(num<0){
                neg = neg + num;
                cant_neg++;
                arr[i] = num;
            }
            else{
                System.out.println("El valor ingresado es incorrecto");
                i--;
            }
        }
        total = pos + neg;
        if(pos>0){
            promedio_pos = pos / cant_pos;
        }
        if(neg<0){
            promedio_neg = neg / cant_neg;
        }
        System.out.println("Los números ingresados son: ");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("El total de la suma entre positivos y negativos es: " + total);
        System.out.println("El promedio de los números positivos es: "+promedio_pos);
        System.out.println("El promedio de los números negativos es: "+promedio_neg);
        
    }

        
}       
               

