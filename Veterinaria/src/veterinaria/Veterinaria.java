package veterinaria;
import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);
    
    String  nombre, especie, color, pelaje, raza, mensaje;
    char sexo, opc;  
    Mascota m;
    Arreglo arre = new Arreglo();
    
    do{
        System.out.println("Ingrese el nombre de la mascota");
        nombre = lector.nextLine();
        
        System.out.println("Ingrese el especie de la mascota");
        especie = lector.nextLine();
        
        System.out.println("Ingrese el sexo de la mascota");
        String sexo1= lector.nextLine();
        sexo =sexo1.charAt(0);
        
        System.out.println("Ingrese el pelaje de la mascota");
        pelaje = lector.nextLine();
        
        System.out.println("Ingrese el raza de la mascota");
        raza = lector.nextLine();
        
        System.out.println("Ingrese el color de la mascota");
        color = lector.nextLine();
        
        m = new Mascota(nombre, especie, color, pelaje, raza, sexo);
        mensaje = arre.cargarMascota(m);
        System.out.println(mensaje);
       
        System.out.println("Desea Continuar");
        String letra = lector.nextLine();
        opc = letra.charAt(0);
        
    }while(opc =='s' || opc=='S');
    
    arre.mostrarDatos();
    
        System.out.println("Ingrese el nombre de la mascota a buscar");
        nombre= lector.nextLine();
        int resultado = arre.Buscar(nombre);
        if(resultado>=0){
            System.out.println("Ingrese el nuevo nombre");
            nombre= lector.nextLine();
            arre.modificarNombre(nombre, resultado);
        }
        
         arre.mostrarDatos();  
         
         System.out.println("Los perritos son: ");
         arre.mostrarPerros();
         
         System.out.println("Ingrese el nombre de la mascota a eliminar");
         String nombre_del = lector.nextLine();
         arre.eliminarMascota(nombre_del);
         
         arre.mostrarDatos();
      }
}