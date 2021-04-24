package justtestingoficial;
import java.util.Scanner;


public class Guia_Ejercicio5 {
    public static void main(String[] args) {
        /*
        Una mercería vende canutillos y mostacillas al por mayor mediante su
        página web. Como se trata de una mercería mayorista, solicita la
        cantidad de paquetes en cada venta y dependiendo de esta realiza los
        siguientes controles:
        d) Si la cantidad de productos es menor a 5: Se debe emitir un mensaje
        indicando que no se permiten compras inferiores a 5 productos.
        e) Si la cantidad de productos es mayor o igual a 5 pero menor o igual
        a 15: Se debe emitir un mensaje que el costo de envío es de $200.
        f) Si la cantidad de productos es mayor o igual a 5 y es mayor a 15: Se
        debe emitir un mensaje de que el envío es gratuito.
        Realizar un programa para llevar a cabo los 3 controles citados.
        */
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de productos");
        int productos = lector.nextInt();
        if (productos < 5){
            System.out.println("No se permiten compras inferiores a 5");
        }
        else if(productos >= 5 && productos <= 15){
            System.out.println("El costo de envío es de $200");
        }
        else{
            System.out.println("El costo de envío es gratuito");
        }
    }
    }
    

