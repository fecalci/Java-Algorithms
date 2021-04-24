package nutricionista;
import java.util.Scanner;

public class Nutricionista {


    public static void main(String[] args) {
   
        String nombre, color, tipoCascara,esComestible;
        float calorias;
        //Fruta f = new Fruta(" "," "," ",0," ");
        Fruta f = new Fruta();
        int cont = 0;
        int opcion;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Indique la cantidad de frutas a cargar");
        int tamaño = lector.nextInt();
        Arreglo arre = new Arreglo(tamaño);
                
        do{    
            
            f = f.inputData();
            arre.cargarDatos(f);          
            cont++;         
        }

        while(cont<tamaño);        
        
        do{
            
        System.out.println("Ingrese 1 para mostrar las frutas creadas, 2 para cambiar los datos de una fruta, 3 para mostrar las frutas de color verde, 4 para eliminar las frutas con valor calórico mayor a X, 5 para mostrar las frutas comestibles, 0 para salir");
        opcion = lector.nextInt();           
        
        switch(opcion){
            
            case 1:  
                arre.mostrarDatos(); 
                break;
                
            case 2 :
                
                System.out.println("Ingrese el nombre de la fruta que quiere cambiar");
                String nombre_cambio = lector.next();
                arre.cambiarDatos(nombre_cambio);  
                arre.mostrarDatos();
                break;
            
            case 3 :
                
                System.out.println("Éstas son las frutas verdes:");
                arre.mostrarVerdes();       
                break;
                
            case 4 :
                
                System.out.println("Ingrese el valor calórico máximo");
                float max_cal = lector.nextFloat();
                arre.eliminarMayorCalorias(max_cal);
                break;
                
            case 5:
                System.out.println("Los comestibles son:");
                arre.mostrarComestibles();
                break;
                
            default:
                System.out.println("El número ingresado es incorrecto");
       
        }
        }
        while(opcion != 0);
        
        




    }
    
}
