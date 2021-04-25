package justtestingoficial;
import java.util.Scanner;


public class Guia3_Ejercicio9{
    /*
    En una tabla de 4 filas y 4 columnas se guardan las notas de 4
    alumnos de secundario. Cada fila corresponde a las notas y al
    promedio de cada alumno.
    Se necesita un programa que permita a un profesor cargar en
    las 3 primeras posiciones de cada fila las notas del alumno y
    que en la última columna se calculen los promedios.
    Una vez realizados los cálculos, se desea mostrar las 3
    notas de cada alumno y el promedio correspondiente recorriendo
    la matriz.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double promedios[] = new double[4];
        double matriz[][] = new double[4][4];
        double fila = 0;
        
        for(int i = 0; i<4;i++){
            double promedio = 0;
            double suma = 0;
            for(int j = 0;j<4;j++){
                
                if(j==3){
                    promedio = suma/3;
                    matriz[i][j] = promedio;
                }
                else{
                System.out.println("Ingrese la nota "+(j+1)+ " del alumno "+ (i+1));
                fila = lector.nextDouble();
                matriz[i][j] = fila;
                suma = suma + fila;                
                }
            }
        }       
    
        for (int x=0; x < matriz.length; x++) {
          System.out.print("|");
          for (int y=0; y < matriz[x].length; y++) {
            System.out.printf ("%.1f",matriz[x][y]);
            if (y!=matriz[x].length-1) System.out.print("\t");
          }
          System.out.println("|");
        }               
    }
        
        
}
        
       
               

