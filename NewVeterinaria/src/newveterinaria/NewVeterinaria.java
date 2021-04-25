package newveterinaria;
import java.util.Scanner;

public class NewVeterinaria {

    public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);
    String  nombre,color, pelaje, raza, mensaje, pulgas, vacunado, cazador, garras, mimoso;
    char sexo, opc;  
    Perro p;
    Gato g;
    Arreglo arre = new Arreglo();
    int op1, edad, opcionMascota;
    
    do{
        System.out.println("--MENU--");
        System.out.println("1- Añadir mascota");
        System.out.println("2- Mostrar mascota");
        System.out.println("3- Buscar mascota");
        System.out.println("4- Modificar datos");
        System.out.println("5- Eliminar mascota ");
        System.out.println("6- Mostrar que comen los animales");
        System.out.println("7- Que hacen mis animales");
        op1=lector.nextInt();
        
        switch(op1){
            case 1: 
                do{
                    System.out.println("Que mascota quieres crear");
                    System.out.println("1- Gato");
                    System.out.println("2- Perro");
                    opcionMascota = lector.nextInt();
                    
                    switch(opcionMascota){
                        
                        case 1: 
                                System.out.println("Vas a crear Gato");
                                System.out.println("Ingrese el nombre del Gato");
                                nombre = lector.next();

                                System.out.println("Ingrese el sexo del Gato");
                                String sexo1= lector.next();
                                sexo =sexo1.charAt(0);

                                System.out.println("Ingrese el pelaje del Gato");
                                pelaje = lector.next();

                                System.out.println("Ingrese el raza del Gato");
                                raza = lector.nextLine();
                                lector.nextLine();

                                System.out.println("Ingrese el color del Gato");
                                color = lector.next();
                                
                                System.out.println("El gato es mimoso");
                                mimoso = lector.next();
                                
                                System.out.println("Tiene garras");
                                garras= lector.next();
                                
                                System.out.println("Es cazador");
                                cazador = lector.next();
                                g = new Gato(cazador, garras, mimoso, nombre, color, pelaje, raza, sexo);
                                mensaje = arre.cargarMascota(g);
                                System.out.println(mensaje);  
                            break;
                            
                        case 2: 
                                System.out.println("Vas a crear Perro");
                                System.out.println("Ingrese el nombre del Perro");
                                nombre = lector.next();

                                System.out.println("Ingrese el sexo del Perro");
                                sexo1= lector.next();
                                sexo =sexo1.charAt(0);

                                System.out.println("Ingrese el pelaje del Perro");
                                pelaje = lector.next();

                                System.out.println("Ingrese el raza del Perro");
                                raza = lector.nextLine();
                                lector.nextLine();

                                System.out.println("Ingrese el color del Perro");
                                color = lector.next();
                                
                                System.out.println("El Perro tiene vacunas");
                                vacunado= lector.next();
                                
                                System.out.println("Tiene pulgas el perro");
                                pulgas= lector.next();
                                
                                System.out.println("Edad del Perro");
                                edad = lector.nextInt();
                                p = new Perro(pulgas, vacunado, edad, nombre, color, pelaje, raza, sexo);
                                mensaje = arre.cargarMascota(p);
                                System.out.println(mensaje);  
                            break;
                    
                        default:    System.out.println("Opcion invalida");
                                    break;
                    }
                    
                    System.out.println("Desea continuar añadiendo mascotas s/n");
                    String opcion = lector.next();
                    opc = opcion.charAt(0);
                }while(opc=='s' || opc=='S');
                
                break;
                
                
            case 2: 
                     arre.mostrarDatos();
            break;
                
                
            case 3: 
                    System.out.println("Ingrese el nombre de la mascota a buscar");
                    nombre= lector.next();
                    int r = arre.Buscar(nombre);
                    if(r>=0){
                        arre.mostrarDato(r);
                    }
            break;
            
            case 4:
                    System.out.println("Ingrese el nombre de la mascota a buscar");
                    nombre= lector.next();
                    int resultado = arre.Buscar(nombre);
                    if(resultado>=0){
                        System.out.println("Ingrese el nuevo nombre");
                        nombre= lector.next();
                        arre.modificarNombre(nombre, resultado);
                    }
            break;
            
            case 6:
                    arre.infoQueComen();
                break;
                
            case 7:
                    arre.queHacen();
                break;

            default: 
                System.out.println("Opcion inválida");
        }
       
        System.out.println("Desea Continuar en el programa s/n");
        String letra = lector.next();
        opc = letra.charAt(0);
        
    }while(opc =='s' || opc=='S');
    
    
    
    }
}