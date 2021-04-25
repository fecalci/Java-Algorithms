package justtestingoficial;
import java.util.Scanner;


public class Guia3_Ejercicio8{
    /*
    Llevar a cabo un programa que permite cargar completamente con
    números una matriz de 4x5 (4 filas, 5 columnas).
    */
    /*
    for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("ingrese un  numero en la posicion ["+ (i+1)+ "]["+(j+1)+"]");
                double columna = lector.nextDouble();
                matriz[i][j]= columna;
            }
        }
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double matriz[][] = new double[4][5];
 
        for (int i = 0;i<5;i++){
            System.out.println("Ingrese el número para la columna "+i);
            double columna = lector.nextDouble();
            matriz[0][i] = columna;
            for(int j = 1;j<4;j++){
                System.out.println("Ingrese el número para la fila "+ j);
                double fila = lector.nextDouble();
                matriz[j][i] = fila;
            }
        }
    
        for (int x=0; x < matriz.length; x++) {
          System.out.print("|");
          for (int y=0; y < matriz[x].length; y++) {
            System.out.print (matriz[x][y]);
            if (y!=matriz[x].length-1) System.out.print("\t");
          }
          System.out.println("|");
        }        

        
    }
        
        
}
        
       
               

