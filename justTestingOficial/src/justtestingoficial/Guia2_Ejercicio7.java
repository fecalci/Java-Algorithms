package justtestingoficial;
import java.util.Scanner;


public class Guia2_Ejercicio7{
    /*
    Pasar de grados centígrados a grados kelvin. El proceso
    de leer grados centígrados se debe repetir mientras que
    se responda ‘S’ a la pregunta: Repetir proceso? (S/N)
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        char repetir;
        
        do{
            
            System.out.println("Ingrese los grados centigrados para convertir a kelvin");
            float grado_c = lector.nextFloat();
            
            float grado_k = grado_c + (float)273.15;      
            System.out.println(grado_c+" grados centígrados son "+grado_k+" grados kelvin");
            
            System.out.println("Desea repetir el proceso? S/N");
            repetir = lector.next().charAt(0);
            
        }
    
        while(repetir == 's');
        
        
    }       
           
}
    

