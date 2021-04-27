package herbolario;

public abstract class Planta {
    /*
    Crear una clase Planta con los atributos: nombre, alto del
tallo, tieneHojas, clima ideal. (con sus métodos y
constructores correspondientes)
    */
    
    private String nombre, tieneHojas, clima_ideal;
    private float alto_tallo;   
    public int id = 0;
    
    public Planta(){
    }

    public Planta(String nombre, String tieneHojas, String clima_ideal, float alto_tallo) {
        this.nombre = nombre;
        this.tieneHojas = tieneHojas;
        this.clima_ideal = clima_ideal;
        this.alto_tallo = alto_tallo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTieneHojas() {
        return tieneHojas;
    }

    public String getClima_ideal() {
        return clima_ideal;
    }

    public float getAlto_tallo() {
        return alto_tallo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTieneHojas(String tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public void setClima_ideal(String clima_ideal) {
        this.clima_ideal = clima_ideal;
    }

    public void setAlto_tallo(float alto_tallo) {
        this.alto_tallo = alto_tallo;
    }

    @Override
    public String toString() {
        return "se llama " +nombre + ", "+ tieneHojas +  " tieneHojas,"+  " su clima ideal es " + clima_ideal + ", el alto del tallo es " + alto_tallo;
    }
    
    public abstract void saludar();
    
    public abstract String queSoy();
    
    //public abstract void soyVenenoso();
    
    
}
