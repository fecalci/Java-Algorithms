package justtestingoficial;
import java.util.Scanner;


public class Guia3_Ejercicio8Re{
    /*
    Llevar a cabo un programa que permite cargar completamente con
    números una matriz de 4x5 (4 filas, 5 columnas).
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double matriz[][] = new double[4][5];
 
        for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("ingrese un  numero en la posicion ["+ (i+1)+ "]["+(j+1)+"]");
                    double columna = lector.nextDouble();
                    matriz[i][j]= columna;
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
        
       
               

