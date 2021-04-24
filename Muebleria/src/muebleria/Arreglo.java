package muebleria;


public class Arreglo {
    
    int indice = 0;
    Mueble [] arre;
    int tamaño;
    
    public Arreglo(int tamaño) {       
        arre = new Mueble[tamaño];
    
    }       
    public String cargarDatos(Mueble m){   
        if(indice<arre.length){
            arre[indice] = m;
            arre[indice].id = indice+1;
            indice++;
           }            
        return "Mueble cargado correctamente";                
    } 
    
    public void mostrarDatos(){
        
        for(int i = 0; i<indice;i++){
            
            System.out.println(arre[i].toString());          
        }     
    }    
    public void cambiarMadera(int id_m){
        
        for(int i= 0;i<indice;i++){
            if(id_m == arre[i].id){
                arre[i].setMaterial("Madera");
                System.out.println(arre[i]);
            }
            
        
        }
        
    }        
}
