package nutricionista;
import java.lang.Float;
import java.util.Scanner;

public class Arreglo {

    Fruta [] arre;
    int indice = 0;
    Fruta f = new Fruta(" "," "," ",0," ");
    
    
    public Arreglo() {
        
        arre = new Fruta[10];
        
    }
    
    public void cargarDatos(Fruta f){
        if(indice < arre.length){
            arre[indice] = f;
            arre[indice].id = indice+1;
            indice++;   
            System.out.println("Fruta cargada con éxito!");
            
        }                
        
    }
    
    public void mostrarDatos(){
        for(int i = 0; i<indice;i++){
            System.out.println(arre[i].toString());
        }
    }
        
    
    
    public void cambiarDatos(String nombre_cambio){
        boolean existe = false;
        for (int i = 0;i<indice;i++){
            if(nombre_cambio.equalsIgnoreCase(arre[i].getNombre())){
                Fruta nueva = f.inputData();
                arre[i].setNombre(nueva.getNombre());
                arre[i].setColor(nueva.getColor());
                arre[i].setTipoCascara(nueva.getTipoCascara());
                arre[i].setCalorias(nueva.getCalorias());
                arre[i].setEsComestible(nueva.getesComestible());
                existe = true;
            }
        }    
        if (!existe){
            System.out.println("La fruta ingresada no existe!");
        }
    }
  
    public void mostrarVerdes(){
        boolean existe = false;
        for(int i = 0; i< indice; i++){
            
            if(arre[i].getColor().equalsIgnoreCase("verde")){
                System.out.println(arre[i].toString()); 
                existe = true;
            }           
        }
        if (!existe){
            System.out.println("No hay frutas verdes!");  
        }
    }
    
    
    public void eliminarMayorCalorias(float max_cal){
        boolean existe = false;
        for(int i = 0;i<indice;i++){
            if(Float.compare(arre[i].getCalorias(),max_cal) >=0){
                System.out.println("Se eliminó la fruta: "+arre[i].getNombre());
                arre[i] = null;
                indice--;
                for(int j = i;j<indice;j++){
                    arre[j] = arre[j+1];                    
                }
                existe = true;               
            }        
        }
        if (!existe){
            System.out.println("No hay frutas con calorías mayores a "+max_cal);  
        }        
    }
    
    public void mostrarComestibles(){
        boolean existe = false;
        for(int i = 0;i<indice;i++){
            
            if(arre[i].getesComestible().equalsIgnoreCase("Si")){
                System.out.println(arre[i].toString());
                existe = true;
            }            
        }
        if (!existe){
            System.out.println("No existen frutas comestibles!");  
        }        
        
        
    }
    
    
}
