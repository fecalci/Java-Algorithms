package justtestingoficial;
import java.util.Scanner;


public class Guia2_Ejercicio9{
    /*
    Realizar un algoritmo que dado por teclado un límite
    numérico (por ejemplo 100) muestre en pantalla todos los
    números hasta ese límite (empezando por 1).
    */    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int num = lector.nextInt();
        for(int i = 1;i<=num;i++){
            System.out.println(i);
        }}
        
           
}
    

