package nutricionista;
import java.util.Scanner;

public class Nutricionista {


    public static void main(String[] args) {
   
        String nombre, color, tipoCascara,esComestible;
        float calorias;
        //Fruta f = new Fruta(" "," "," ",0," ");
        Fruta f = new Fruta();
        int opcion;
        char opc;
        
        Scanner lector = new Scanner(System.in);
        
        Arreglo arre = new Arreglo();
            
        
        do{
            
            System.out.println("Ingrese 1 para ingresar una fruta");
            System.out.println("Ingrese 2 para mostrar las frutas creadas");
            System.out.println("Ingrese 3 para cambiar los datos de una fruta");
            System.out.println("Ingrese 4 para mostrar las frutas de color verde");
            System.out.println("Ingrese 5 para eliminar las frutas con valor calórico mayor a X ");
            System.out.println("Ingrese 6 para mostrar las frutas comestible");

            opcion = lector.nextInt();           

            switch(opcion){

                case 1:
                    f = f.inputData();
                    arre.cargarDatos(f);    
                    break;

                case 2:  
                    arre.mostrarDatos(); 
                    break;

                case 3 :

                    System.out.println("Ingrese el nombre de la fruta que quiere cambiar");
                    String nombre_cambio = lector.next();
                    arre.cambiarDatos(nombre_cambio);  
                    arre.mostrarDatos();
                    break;

                case 4 :

                    System.out.println("Éstas son las frutas verdes:");
                    arre.mostrarVerdes();       
                    break;

                case 5 :

                    System.out.println("Ingrese el valor calórico máximo");
                    float max_cal = lector.nextFloat();
                    arre.eliminarMayorCalorias(max_cal);
                    break;

                case 6:
                    System.out.println("Los comestibles son:");
                    arre.mostrarComestibles();
                    break;

                default:
                    System.out.println("El número ingresado es incorrecto");
                    break;

        }
        System.out.println("Desea Continuar en el programa s/n");
        String letra = lector.next();
        opc = letra.charAt(0);
        
    }while(opc =='s' || opc=='S');
        
        




    }
    
}
