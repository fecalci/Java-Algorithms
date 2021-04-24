package zapateria;

public class Venta {
    
    int idVenta, idProducto, importeProducto, cantProducto, importeVenta;
 
    int calcularVenta(){
        int total = importeProducto * cantProducto;
        return total;
    }
    
    
}
