package muebleria;

public class Mueble {
    
    private String nombre, material;
    private float alto, ancho;
    private int cantidad;
    public int id = 0;

    
    public Mueble(String nombre, String material, float alto, float ancho, int cantidad) {
        this.nombre = nombre;
        this.material = material;
        this.alto = alto;
        this.ancho = ancho;
        this.cantidad = cantidad;
    }

    
    
    //-------------GETTER------------
    
    public String getNombre() {
        return nombre;
    }

    public String getMaterial() {
        return material;
    }

    public float getAlto() {
        return alto;
    }

    public float getAncho() {
        return ancho;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getId() {
        return id;
    }
 
    
    //-------------SETTER------------
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mueble id " +id + " llamado " + nombre + " hecho de " + material + " con una altura de " + alto + ", ancho de " + ancho + "y con stock de " + cantidad;
    }


    
    
    
}
