package justtestingoficial;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        /*
        3. Leer un valor numérico que representa un día de la semana. Se
        pide mostrar por pantalla el nombre del día considerando que el
        lunes es el día 1, el martes es el día 2 y así, sucesivamente.
        */
        Scanner lector = new Scanner (System.in);
        System.out.println("Escriba un valor numérico que represente un día de la semana");
        int num_dia = lector.nextInt();
        String dia = "";
        if(num_dia == 1){
            dia = "Lunes";
        }
        else if(num_dia == 2){
            dia = "Martes";
        }
         else if(num_dia == 3){
            dia = "Miercoles";
        }
         else if(num_dia == 4){
            dia = "Jueves";
        }
         else if(num_dia == 5){
            dia = "Viernes";
        }
         else if(num_dia == 6){
            dia = "Sabado";
        }
         else if(num_dia == 7){
            dia = "Domingo";
        }
        System.out.println("El día es :" + dia);
    }
    }
    

