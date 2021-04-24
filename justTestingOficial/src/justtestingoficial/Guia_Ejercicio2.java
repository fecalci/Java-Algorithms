package justtestingoficial;
import java.util.Scanner;


public class Guia_Ejercicio2 {
    public static void main(String[] args) {
        /*
        Realizar un programa que permita calcular el área de un triángulo. Se
        recuerda que la fórmula para calcular el área de un triángulo es: (base *
        altura) / 2. Se debe permitir al usuario ingresar la base y la altura,
        mientras que el programa debe calcular el área y mostrar el resultado por
        pantalla.
        */
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingresar la base del triángulo");
        float base = lector.nextFloat();
        System.out.println("Ingresar la altura del triángulo");
        float altura = lector.nextFloat();
        float area = (base * altura) / 2;
        System.out.println(area);
    }
    }
    

