package automotriz;

public class Arreglo {
    int indice = 0;
    Vehiculo [] arre;    
    
    
    
    public Arreglo(){         
        arre = new Vehiculo[10];
    }
    
    public String cargarVehiculo(Vehiculo v){
        if(indice < arre.length){
            arre[indice] = v;
            arre[indice].id = indice + 1;
            indice++;
            return "Vehículo cargado correctamente";
        }
        return "No hay más espacio para vehículos";

              
    }
    
    public void mostrarVehiculos(){
        for(int i = 0; i<indice;i++){
            System.out.println(arre[i].toString());                        
        }
        
    }
    
    public void buscarAptoDiscapacitado(){
        
        for(int i = 0; i<indice;i++){
            if(arre[i].esAptoDiscapacitado().equalsIgnoreCase("Si")){
                System.out.println(arre[i]);
                }
            }
            
        }
    
    public void queHacen(){
        
        for (int i = 0; i< indice; i++){
            arre[i].queHacen();
        }
        
    }
    
    public void cambiarPatente(String marca_buscar, String patente_nueva){
        
        for(int i = 0;i<indice;i++){
            if(arre[i].getMarca().equalsIgnoreCase(marca_buscar)){
                arre[i].setPatente(patente_nueva);
            }
            
        }
        
    }
    
    public void buscarAutoMoto(int id_buscar){
    
        for(int i = 0; i< indice; i++){
            if(arre[i].id == id_buscar){
                if(arre[i].tipo().equals("Auto")){
                    System.out.println("La marca del auto id "+arre[i].id+" es: "+arre[i].getMarca());
                }
                else if(arre[i].tipo().equals("Moto")){
                    System.out.println("La cilindrada de la moto id "+arre[i].id+" es: " + arre[i].cilindrada());
                }
                else{
                    System.out.println("Ese id no pertenece ni a un auto ni a una moto!");
                }
                
            }
            
        }
        
    }
        
        
    }
    
    
