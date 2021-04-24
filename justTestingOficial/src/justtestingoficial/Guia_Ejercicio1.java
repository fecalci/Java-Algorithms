package justtestingoficial;
import java.util.Scanner;


public class Guia_Ejercicio1 {
    public static void main(String[] args) {
        /*
        Realizar un programa que permita a un profesor calcular el promedio de un
        alumno. Para esto, el algoritmo debe permitir ingresar las 4 notas del
        mismo (por ejemplo, 8, 7, 9.50 y 10), luego calcular el promedio de las
        mismas y mostrar el resultado por pantalla. Se recuerda que el promedio
        es la suma de todas las notas dividido la cantidad, en el ejemplo sería:
        (8+7+9.50+10)/4.
        */
        float promedio = 0;
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese la primer nota");
        float nota_a = lector.nextFloat();
        System.out.println("Ingrese la segunda nota");
        float nota_b = lector.nextFloat();
        System.out.println("Ingrese la tercer nota");
        float nota_c = lector.nextFloat();
        System.out.println("Ingrese la cuarta nota");
        float nota_d = lector.nextFloat();
        promedio = (nota_a + nota_b + nota_c + nota_d) /4;
        System.out.println(promedio);
        
    }
    }
    

