package zapateria;

public class Cliente {
    
    int dniCliente, numTelefono;
    String correo, direccion;     
  
    
    String obtenerDniYDirec(){
        
        String dato = "El cliente con dni "+dniCliente +" vive en "+ direccion;
        return dato;
        
    }
    
}
