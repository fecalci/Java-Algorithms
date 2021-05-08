package herbolario;

public class Arreglo {
    int indice = 0;
    Planta [] arre;    
    
    
    
    public Arreglo(){         
        arre = new Planta[10];
    }
    
    public String cargarPlanta(Planta p){
        if(indice < arre.length){
            arre[indice] = p;
            arre[indice].id = indice + 1;
            indice++;
            return "Planta cargada correctamente";
        }
        return "No hay más espacio para plantas";

              
    }
    
    public void mostrarPlantas(){
        for(int i = 0; i<indice;i++){
            System.out.println(arre[i].toString());                        
        }
        
    }
    
    public String recorrerQueEs(int id_cambio){
        for(int i = 0;i<indice;i++){
            if(arre[i].id == id_cambio){
                return arre[i].queSoy();
                }              
            }
        return "No";    
    }
    
    public void modificarArray(Planta p, int id_cambio){
        
        for(int i = 0;i<indice;i++){
            if(arre[i].id == id_cambio){
                arre[i] = p;
            }
        }
        
    }
    
    public void saludar(){
        for(int i = 0;i<indice;i++){
            arre[i].saludar();
        }
        
    }
    
    public void queHacen(){
        for(int i = 0;i<indice;i++){
            arre[i].queHacen();
        }
    }
    
    public void queSoy(){
        
        for (int i = 0; i< indice; i++){
            arre[i].queSoy();
        }
    
    }        
        
 }
    
    
