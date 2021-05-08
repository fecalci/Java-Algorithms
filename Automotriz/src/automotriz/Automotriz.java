package automotriz;
import java.util.Scanner;

public class Automotriz {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        int opcion;
        int opcion_vehiculo;
        String mensaje;
        int numChasis,cantAsientos, cantidadCaballos, cilindrada,cantidadEjes;
        String color, marca, modelo ,patente, motor, materialAsientos, materialManubrio,aptoDiscapacitados,
               poseeLectorSube, tipoColectivo,tieneAcoplado;
        char opc;
        
        
        Arreglo arre = new Arreglo();
        
        Auto a;
        Moto m;
        Colectivo c;
        Camion ca;
        
        
        do{
        
        System.out.println("Presione 1 para ingresar un vehículo");
        System.out.println("Presione 2 para mostrar todos los vehículos ingresados");
        System.out.println("Presione 3 para modificar la patente de un vehículo");
        System.out.println("Presione 4 para saber qué colectivos son aptos para personas con discapacidad");
        System.out.println("Presione 5 para mostrar la marca/cilindrada de un auto/moto dado un id");
        System.out.println("Presione 6 para saber la característica de cáda vehículo ingresado");
        System.out.println("Presione 7 para saber que hace cada vehículo ingresado");
        //System.out.println("Presione 0 para finalizar");
        opcion = lector.nextInt();
        
        switch(opcion){
            
            case 1: 
                System.out.println("Presione 1 para crear un auto, 2 para moto, 3 para colectivo o 4 para camión");
                opcion_vehiculo = lector.nextInt();
                
                switch(opcion_vehiculo){
                
                    case 1:
                        System.out.println("Ingrese la patente del auto");
                        patente = lector.next();
                        
                        System.out.println("Ingrese el número de chasis");
                        numChasis = lector.nextInt();
                        
                        System.out.println("Ingrese la cantidad de asientos");
                        cantAsientos = lector.nextInt();
                        
                        System.out.println("Ingrese el material de los asientos");
                        materialAsientos = lector.next();
                        
                        System.out.println("Ingrese la cantidad de caballos");
                        cantidadCaballos = lector.nextInt();
                        
                        System.out.println("Ingrese el motor");
                        motor = lector.next();
                        
                        System.out.println("Ingrese el color");
                        color = lector.next();
                        
                        System.out.println("Ingrese la marca");
                        marca = lector.next();
                        
                        System.out.println("Ingrese el modelo");
                        modelo = lector.next();
                        
                        a = new Auto(materialAsientos, cantidadCaballos, patente, numChasis, cantAsientos, motor, color, marca,modelo);
                        mensaje = arre.cargarVehiculo(a);
                        System.out.println(mensaje);
                        break;
                        
                        
                    case 2:                       
                        
                        System.out.println("Ingrese la patente de la moto");
                        patente = lector.next();
                        
                        System.out.println("Ingrese el número de chasis");
                        numChasis = lector.nextInt();
                        
                        System.out.println("Ingrese la cantidad de asientos");
                        cantAsientos = lector.nextInt();                                               
                        
                        System.out.println("Ingrese el motor");
                        motor = lector.next();
                        
                        System.out.println("Ingrese el color");
                        color = lector.next();
                        
                        System.out.println("Ingrese la marca");
                        marca = lector.next();
                        
                        System.out.println("Ingrese el modelo");
                        modelo = lector.next();        
                        
                        System.out.println("Ingrese la cilindrada");
                        cilindrada = lector.nextInt();
                        
                        System.out.println("Ingrese el material del manubrio");
                        materialManubrio = lector.next();
                        
                        m = new Moto(cilindrada, materialManubrio, patente, numChasis, cantAsientos, motor, color,  marca,modelo);
                        mensaje = arre.cargarVehiculo(m);
                        System.out.println(mensaje);
                        break;
                        
                        
                    case 3:                        
                        
                        System.out.println("Ingrese la patente del colectivo");
                        patente = lector.next();
                        
                        System.out.println("Ingrese el número de chasis");
                        numChasis = lector.nextInt();
                        
                        System.out.println("Ingrese la cantidad de asientos");
                        cantAsientos = lector.nextInt();                                               
                        
                        System.out.println("Ingrese el motor");
                        motor = lector.next();
                        
                        System.out.println("Ingrese el color");
                        color = lector.next();
                        
                        System.out.println("Ingrese la marca");
                        marca = lector.next();
                        
                        System.out.println("Ingrese el modelo");
                        modelo = lector.next();        
                        
                        System.out.println("Ingrese el tipo de colectivo");
                        tipoColectivo = lector.next();                      
                        
                        System.out.println("Ingrese si es apto discapacitados SI/NO");
                        aptoDiscapacitados = lector.next();
                        
                        System.out.println("Ingrese si posee lector de sube SI/NO");
                        poseeLectorSube = lector.next();                        
                        
                        c = new Colectivo(aptoDiscapacitados, poseeLectorSube, tipoColectivo, patente,numChasis, cantAsientos, motor, color, marca,modelo);
                        mensaje = arre.cargarVehiculo(c);
                        System.out.println(mensaje);
                        break;
                     
                    case 4:
                        
                        System.out.println("Ingrese la patente del camión");
                        patente = lector.next();
                        
                        System.out.println("Ingrese el número de chasis");
                        numChasis = lector.nextInt();
                        
                        System.out.println("Ingrese la cantidad de asientos");
                        cantAsientos = lector.nextInt();                                               
                        
                        System.out.println("Ingrese el motor");
                        motor = lector.next();
                        
                        System.out.println("Ingrese el color");
                        color = lector.next();
                        
                        System.out.println("Ingrese la marca");
                        marca = lector.next();
                        
                        System.out.println("Ingrese el modelo");
                        modelo = lector.next();        
                        
                        System.out.println("Ingrese si el camión tiene acoplado SI/NO");
                        tieneAcoplado = lector.next();                      
                        
                        System.out.println("Ingrese la cantidad de ejes que posee");
                        cantidadEjes = lector.nextInt();
                        
                        ca = new Camion(tieneAcoplado,cantidadEjes, patente, numChasis, cantAsientos, motor, color, marca, modelo);
                        mensaje = arre.cargarVehiculo(ca);
                        System.out.println(mensaje);
                        break;
                        
                    default:
                        System.out.println("El número ingresado es inválido");
                        
                    }
                break;
                
            case 2:   
                arre.mostrarVehiculos();
                break;
                
            case 3:
                System.out.println("Ingrese la marca del auto que quiere modificar la patente");
                String marca_buscar = lector.next();
                System.out.println("Ingrese la nueva patente del auto con marca "+marca_buscar);
                String patente_nueva = lector.next();
                arre.cambiarPatente(marca_buscar, patente_nueva);
                break;
                
            case 4:               
                arre.buscarAptoDiscapacitado();  
                break;
                
            case 5:
                System.out.println("Ingrese el ID del auto/ moto que quiere conocer la marca/cilindrada");
                int id_buscar = lector.nextInt();
                arre.buscarAutoMoto(id_buscar);
                break;
                
            case 6:
                arre.queHacen();            
                break;
                
            case 7:
                arre.queHacenn();
                break;
                
            default:
                System.out.println("El número ingresado es invalido");
                }
        
            
        System.out.println("Desea Continuar en el programa s/n");
        String letra = lector.next();
        opc = letra.charAt(0);
        
    }while(opc =='s' || opc=='S');
        
    }
    
}
