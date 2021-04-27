package muebleria;


public class Arreglo {
    
    int indice = 0;
    Mueble [] arre;
    
    public Arreglo() {       
        arre = new Mueble[10];
    
    }       
    public String cargarDatos(Mueble m){   
        if(indice<arre.length){
            arre[indice] = m;
            arre[indice].id = indice+1;
            indice++;
            return "Mueble cargado correctamente";
           }            
        return "No queda espacio para muebles  :(";                
    } 
    
    public void mostrarDatos(){
        
        for(int i = 0; i<indice;i++){
            
            System.out.println(arre[i].toString());          
        }     
    }    
    public String cambiarMadera(int id_m){
        
        for(int i= 0;i<indice;i++){
            if(id_m == arre[i].id){
                arre[i].setMaterial("Madera");
                System.out.println(arre[i]);
                return "El mueble fue modicado correctamente";
                
            }
        }
        return "El mueble con ese ID no existe";
        
    }        
}
