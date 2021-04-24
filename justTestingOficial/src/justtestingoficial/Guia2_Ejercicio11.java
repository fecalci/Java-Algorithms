package justtestingoficial;
import java.util.Scanner;


public class Guia2_Ejercicio11{
    /*
    Un gerente de una empresa prestadora de servicios de
    internet necesita un algoritmo que permita realizar el
    cálculo del monto a pagar de la factura de consumo de
    internet de 5 clientes de una empresa. Para ello, el
    algoritmo debe solicitar por teclado dos datos: Dni del
    cliente y tipo de servicio. Los tipos de servicio son 3:
    -Internet 30 megas (cuyo valor es de $750 – 10% de
    descuento)
    -Internet 50 megas (Cuyo valor es de $930 – 5% de
    descuento)
    -Internet 100 megas (Cuyo valor fijo es de $1200)
    El algoritmo debe poder calcular el monto a pagar
    (dependiendo del tipo de servicio con el que cuente el
    cliente) e informar por pantalla el dni del mismo junto
    con el monto a pagar y el número de servicio con el que
    cuenta.
    */    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        int contador = 0;
        float total = 0;
        do{
            System.out.println("Ingrese el dni del cliente");
            int dni = lector.nextInt();
            System.out.println("Ingrese tipo de servicio: 1- 30 megas, 2- 50 megas, 3- 100 megas");
            int servicio = lector.nextInt(); 
            if (servicio > 0 && servicio <= 3){
                contador = contador + 1;
            }
            
            switch(servicio){
                
                case 1:
                    total = total + (750-(750*(float)0.10));
                    System.out.println("El cliente con DNI "+dni+" debe pagar: "+total);
                    break;
            
                case 2:
                    total = total + (930-(930*(float)0.05));
                    System.out.println("El cliente con DNI "+dni+" debe pagar: "+total);
                    break;
                
                case 3:
                    total = 12000;
                    System.out.println("El cliente con DNI "+dni+" debe pagar: "+total);
                    break;
            
                default:
                    System.out.println("El número ingresado es incorrecto, vuelva a probar");
                      
            }
        }
        while(contador < 5);
    }          
}
    

