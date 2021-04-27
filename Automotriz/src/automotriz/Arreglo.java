package automotriz;

public class Arreglo {
    int indice = 0;
    Vehiculo [] arre;  
    Auto a = new Auto();
    Moto m = new Moto();
    Colectivo c = new Colectivo();
    Camion ca = new Camion();
    
    
    
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
            if(arre[i] instanceof Colectivo){ 
                Colectivo cole = (Colectivo) arre[i];
                if(cole.getAptoDiscapacitados().equalsIgnoreCase("Si")){
                    System.out.println(arre[i]);
                }
                }
            }
            
        }
    
    public void queHacen(){
        
        for (int i = 0; i< indice; i++){
            arre[i].soyVehiculo();
        }
        
    }
    
    public void cambiarPatente(String marca_buscar, String patente_nueva){
        boolean existe = false;
        
        for(int i = 0;i<indice;i++){
            if(arre[i].getMarca().equalsIgnoreCase(marca_buscar)){
                arre[i].setPatente(patente_nueva);
                existe = true;
            }                        
        }
        if(!existe){
            System.out.println("No existe el auto de esa marca");
        }
        
    }
    
    public void buscarAutoMoto(int id_buscar){
    
        for(int i = 0; i< indice; i++){
            if(arre[i].id == id_buscar){
                if(arre[i] instanceof Auto){                    
                    System.out.println("La marca del auto id "+arre[i].id+" es: "+arre[i].getMarca());
                }
                else if(arre[i] instanceof Moto){
                    Moto moto = (Moto) arre[i];
                    System.out.println("La cilindrada de la moto id "+arre[i].id+" es: " + moto.getCilindrada());
                }
                else{
                    System.out.println("Ese id no pertenece ni a un auto ni a una moto!");
                }
                
            }
            
        }
        
    }
        
        
    }
    
    
