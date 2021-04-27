package muebleria;
import java.util.Scanner;

public class Muebleria {
    
    public static void main(String[] args) {
        
        
        String nombre, material;
        float alto, ancho;
        int cantidad,opcion;
        Mueble m;          
        String letra;
        char opc1;
        
        Scanner lector = new Scanner(System.in);   
        Arreglo arre = new Arreglo();
        
        
        do{
            
            System.out.println("Ingrese 1 para ingresar un mueble");
            System.out.println("Ingrese 2 para mostrar los muebles ingresados");
            System.out.println("Ingrese 3 para cambiar el tipo de material a Madera");
            opcion = lector.nextInt();
            
            switch(opcion){
                
                case 1:

            
                    System.out.println("Ingrese el nombre del mueble");
                    nombre = lector.next();

                    System.out.println("Ingrese el material del mueble");
                    material = lector.next();            

                    System.out.println("Ingrese el alto del mueble");
                    alto = lector.nextFloat();           

                    System.out.println("Ingrese el ancho del mueble");
                    ancho = lector.nextFloat();

                    System.out.println("Ingrese la cantidad");
                    cantidad = lector.nextInt();

                    m = new Mueble(nombre,material,alto,ancho,cantidad);
                    String carga = arre.cargarDatos(m);
                    System.out.println(carga);
                    break;
                    
                case 2:
                    arre.mostrarDatos();
                    break;
                    
                    
                case 3:
                    System.out.println("Ingrese el id del mueble a ingresar MADERA");
                    int id_m = lector.nextInt();
                    arre.cambiarMadera(id_m); 
                    break;          
                    
                default:
                    System.out.println("El número ingresado es incorrecto");
                    break;
            }
            System.out.println("Desea continuar en el programa? s/n ");
            letra = lector.next();
            opc1 = letra.charAt(0);
  
        
        }
        while(opc1 =='s' || opc1=='S');
    }
    
}
