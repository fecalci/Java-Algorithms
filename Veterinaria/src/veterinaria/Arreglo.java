package veterinaria;
import java.util.Arrays;


public class Arreglo {
    int indice = 0;
    Mascota [] arre;

    public Arreglo() {
        arre = new Mascota [10];
    }

    
    public String cargarMascota (Mascota m){
        if(indice<arre.length){
            arre[indice]= m;
            arre[indice].id=indice+1; //Me asigna el valor del contador + 1 en el objeto. Por lo que al crear un objeto este tendra como id=1 y se incrementará a medida de que vayamos creando más objetos
            indice++;
           return  "Mascota guardada correctamente";
        }
        return "La veterinaria esta llena de mascotas";
    }
    
    public void mostrarDatos(){
        for (int i = 0; i <indice; i++) {
            System.out.println(arre[i].toString());   
        }
    }

    
    public int Buscar(String nombre){
        for (int i = 0; i <indice; i++) {
            if (arre[i].getNombre().compareToIgnoreCase(nombre)==0) {
                return i;
            }
        }
        return -1;
    }
    
    public void modificarNombre(String nombreN, int ubicacion){
                arre[ubicacion].setNombre(nombreN);
                System.out.println("Nombre modificado");
    }
    
    public void mostrarPerros(){
        boolean encontro = false;
        for(int i = 0; i<indice;i++){
            if(arre[i].getEspecie().compareToIgnoreCase("perro")==0){
                System.out.println(arre[i].toString());
                encontro = true;
            }
            
        }
        if (encontro = false){
            System.out.println("No hay perritos :(");
        }
    }
    
    public void eliminarMascota(String nombre){
        
        for(int i = 0; i<indice;i++){
            if(arre[i].getNombre().compareToIgnoreCase(nombre)==0){       
                System.out.println("Mascota eliminada: " +arre[i].getNombre());
                arre[i] = null;      
                indice--;
            }
        }
        
    }
    
}