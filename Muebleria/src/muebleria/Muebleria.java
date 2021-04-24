package muebleria;
import java.util.Scanner;

public class Muebleria {
    
    /*
     Una mueblería de muebles de algarrobo necesita del siguiente modelado
    de objetos para administrar los datos de sus muebles que dispone para
    la venta:
    • Crear una clase llamada Mueble que tenga los siguientes atributos:
    nombre, alto, ancho, material, cantidad.
    • Crear n muebles utilizando parámetros.
    • Mostrar por pantalla el nombre y el material de los muebles.
    • Colocar “Madera” como material de un 1 mueble cuyo id sea igual a
    un valor entero ingresado por consola. Luego mostrar los datos del
    mueble modificado.
    */
    
    public static void main(String[] args) {
        
        String nombre, material;
        float alto, ancho;
        int cantidad,cont = 0;
        Mueble m;     
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de muebles a ingresar");
        int tamaño = lector.nextInt();       
        Arreglo arre = new Arreglo(tamaño);
        
        do{
            
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
            cont++;
            arre.mostrarDatos();
            
        }
        
        while(cont<tamaño);
        System.out.println("Ingrese el id del mueble a ingresar MADERA");
        int id_m = lector.nextInt();
        arre.cambiarMadera(id_m);          
        
    }
    
}
