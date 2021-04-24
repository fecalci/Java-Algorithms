package justtestingoficial;
import java.util.Scanner;


public class Guia2_Ejercicio2{
    /*
    Ingresar el número de mes y el año y reporte el número
    de días que tiene ese mes.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int mes;
        do{
            System.out.println("Ingrese un número de mes");
            mes = lector.nextInt();
            System.out.println("Ingrese un número de año");
            int ano = lector.nextInt();
            if (mes > 12 || mes <0){
                System.out.println("El mes ingresado es inválido");
            }
        }
        while(mes<0 || mes >12);
        
        switch(mes){
            
            case 1: 
                System.out.println("Enero tiene 31 días");
                break;
                
            case 2:
                System.out.println("Febrero tiene 28 días");
                break;
            
            case 3:
                System.out.println("Marzo tiene 31 días");
                break;
            
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
                
            case 5:   
                System.out.println("Mayo tiene 31 días");
                break;
                
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
                
            case 7:    
                System.out.println("Julio tiene 31 días");
                break;
                
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
                
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
                
            case 10:
                System.out.println("Octubre tiene 31 días");
                break;
                
            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;
            
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
                
            default:
                System.out.println("El número ingresado es incorrecto");
                break;
        }
        

    }       
           
}
    

