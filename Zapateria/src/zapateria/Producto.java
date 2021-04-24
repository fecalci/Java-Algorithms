package zapateria;

public class Producto {
    
    public String color, marca, material, tipo;
    public int idProducto, cantidadStock, importeProducto, talle;

    public Producto(String color, String marca, String material, String tipo, int idProducto, int cantidadStock, int importeProducto, int talle) {
        this.color = color;
        this.marca = marca;
        this.material = material;
        this.tipo = tipo;
        this.idProducto = idProducto;
        this.cantidadStock = cantidadStock;
        this.importeProducto = importeProducto;
        this.talle = talle;
    }
    
    //-----------------------------------------------

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getMaterial() {
        return material;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public int getImporteProducto() {
        return importeProducto;
    }

    public int getTalle() {
        return talle;
    }

    
    //----------------------------------------------
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public void setImporteProducto(int importeProducto) {
        this.importeProducto = importeProducto;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }
     
    
    
    
    //--------------------------------------------------
    
     
    boolean hayStock () {
        
        boolean stock = false;
        
        if(cantidadStock > 0){
            stock = true;
        }
        
        return stock;
    }
    
    
    
    
}
