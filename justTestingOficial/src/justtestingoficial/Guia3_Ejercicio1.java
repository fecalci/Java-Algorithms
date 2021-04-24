package justtestingoficial;
import java.util.Scanner;


public class Guia3_Ejercicio1{
    /*
    Llevar a cabo un programa que incluya un vector que almacene los
    siguientes nombres: Alejandra, Leonardo, Rosa, Guillermo,
    Gabriel, Daniel, Luisa y Ludmila. Realizar un recorrido del
    vector para cargar los datos y otro recorrido para mostrar los
    mismos por pantalla.
    */
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        String nombres [] = new String[8];
        String nombre;
        int i = 0;
        
        do{
            
            System.out.println("Ingrese el nombre a almacenar");
            nombre = lector.nextLine();
            
            switch(nombre){

                case "Alejandra","alejandra":
                    nombres[i] = nombre;
                    i++;
                    break;
                
                case "Leonardo","leonardo":
                    nombres[i] = nombre;
                    i++;
                    break;
                    
                case "Rosa","rosa":
                    nombres[i] = nombre;
                    i++;
                    break;                    
                    
                case "Gabriel","gabriel":
                    nombres[i] = nombre;
                    i++;
                    break;                     
                    
                case "Guillermo","guillermo":
                    nombres[i] = nombre;
                    i++;
                    break;                   
                    
                 case "Daniel","daniel":
                    nombres[i] = nombre;
                    i++;
                    break;      
                    
                case "Luisa","luisa":
                    nombres[i] = nombre;
                    i++;
                    break;                    
                    
                case "Ludmila","ludmila":
                    nombres[i] = nombre;
                    i++;
                    break;                  
                                   
                 
                default:
                    System.out.println("El nombre ingresado es incorrecto");
                    break;                
            }
        }
        
        while(i<8);
        
        for(int j = 0; j< nombres.length;j++){
            System.out.println(nombres[j]);          
        }
    }

        
}       
               

