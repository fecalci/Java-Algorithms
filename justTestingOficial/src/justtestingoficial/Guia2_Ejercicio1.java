package justtestingoficial;
import java.util.Scanner;


public class Guia2_Ejercicio1{
    /*
    Ingresar por teclado una palabra en minúsculas y luego
    contar la cantidad de vocales y consonantes que tiene.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int vocales = 0;
        int consonantes = 0;
        System.out.println("Ingrese una palabra en minúsculas");
        String palabra = lector.nextLine();
        for(int i = 0; i<palabra.length();i++){
            
            char palabra_idx = palabra.charAt(i);
            //String pal = String.valueOf(palabra_idx);           
            if(palabra_idx == 'a' || palabra_idx == 'e' || palabra_idx == 'i' || palabra_idx == 'o' || palabra_idx == 'u'){
                vocales = vocales + 1;
            }
            else{
                consonantes = consonantes + 1;
            }
        }
        System.out.println("La palabra tiene "+ vocales+ " vocales");
        System.out.println("La palabra tiene "+ consonantes+ " consonantes");
        
    }       
           
}
    

