package herbolario;

public class Arbol extends Planta {
    
    String variedad, tipo_tronco, color, tipo_hojas;
    float radio_tronco;
    
    public Arbol(){}

    public Arbol(String variedad, String tipo_tronco, String color, String tipo_hojas, float radio_tronco, String nombre, String tieneHojas, String clima_ideal, float alto_tallo) {
        super(nombre, tieneHojas, clima_ideal, alto_tallo);
        this.variedad = variedad;
        this.tipo_tronco = tipo_tronco;
        this.color = color;
        this.tipo_hojas = tipo_hojas;
        this.radio_tronco = radio_tronco;
    }

    public String getVariedad() {
        return variedad;
    }

    public String getTipo_tronco() {
        return tipo_tronco;
    }

    public String getColor() {
        return color;
    }

    public String getTipo_hojas() {
        return tipo_hojas;
    }

    public float getRadio_tronco() {
        return radio_tronco;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void setTipo_tronco(String tipo_tronco) {
        this.tipo_tronco = tipo_tronco;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo_hojas(String tipo_hojas) {
        this.tipo_hojas = tipo_hojas;
    }

    public void setRadio_tronco(float radio_tronco) {
        this.radio_tronco = radio_tronco;
    }

    
    @Override
    public String toString() {
        return super.toString() + "Arbol{" + "variedad=" + variedad + ", tipo_tronco=" + tipo_tronco + ", color=" + color + ", tipo_hojas=" + tipo_hojas + ", radio_tronco=" + radio_tronco + '}';
    }
    
    
}
