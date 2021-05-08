package herbolario;
import java.util.Scanner;

public class Herbolario {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        String esDomestico, variedad, color_hojas, sePodaONo,nombre, tieneHojas,clima_ideal,color_petalo,color_pistilo,estacion, 
               color, tipo_tronco,tipo_hojas;
        float Ancho, alto_tallo, radio_tronco;
        int opcion, opcion_ingreso, cant_petalos, id_cambio;
        String mensaje;
        
        Arreglo arre = new Arreglo();
        Arbusto a = new Arbusto();
        Flor f = new Flor();
        Arbol bol = new Arbol();
        
        do{
        
        System.out.println("Ingrese 1 para ingresar planta");
        System.out.println("Ingrese 2 para mostrar todas las plantas ingresadas");
        System.out.println("Ingrese 3 para modificar una planta ingresada");
        System.out.println("Ingrese 4 para saludar a las plantas");
        System.out.println("Ingrese 5 para ver qué hacen las plantas");
        System.out.println("Ingrese 0 para finalizar");
        opcion = lector.nextInt();
        
        switch(opcion){
            
            case 1: 
                
                System.out.println("Ingrese 1 para ignresar un arbusto");
                System.out.println("Ingrese 2 para ingresar una flor");
                System.out.println("Ingrese 3 para ingresar un arbol");
                opcion_ingreso = lector.nextInt();
                
                switch(opcion_ingreso){   
                    
                    case 1:
                        a = a.inputData();
                        mensaje = arre.cargarPlanta(a);
                        System.out.println(mensaje);
                        break;
                        
                    case 2:                        
                        f = f.inputData();
                        mensaje = arre.cargarPlanta(f);
                        System.out.println(mensaje);
                        break;
                       
                    case 3:                        
                        bol = bol.inputData();
                        mensaje = arre.cargarPlanta(bol);
                        System.out.println(mensaje);
                        break;
                        
                    default:
                        System.out.println("El número de planta ingresado es incorrecto");
                        break;                   
                    
                }
                break;                
                
            case 2:
                arre.mostrarPlantas();
                break;
                
            case 3:
                System.out.println("Ingrese el id de la planta que desea modificar");
                id_cambio = lector.nextInt();
                mensaje = arre.recorrerQueEs(id_cambio);
                if(mensaje.equalsIgnoreCase("Arbol")){
                    bol = bol.inputData();
                    arre.modificarArray(bol, id_cambio);
                }
                else if(mensaje.equalsIgnoreCase("Flor")){
                    f = f.inputData();
                    arre.modificarArray(f, id_cambio);
                }
                else if(mensaje.equalsIgnoreCase("Arbusto")){
                    a = a.inputData();
                    arre.modificarArray(a, id_cambio);
                }
                else{
                    System.out.println("El id ingresado es incorrecto");
                }
                break;
                
            case 4:
                arre.saludar();
                break;
                
            case 5:
                arre.queHacen();
            
        }
            
        
        }
        while(opcion != 0);
        
    }
    
}
