package herbolario;

public class Arbusto extends Planta {
    /*
    Arbusto: Ancho arbusto, esDomestico, variedad arbusto,
color de hojas, sePodaONo
    */
    
    private String esDomestico, variedad, color_hojas, sePodaONo;
    private float Ancho;
    
    public Arbusto(){}

    
    public Arbusto(String esDomestico, String variedad, String color_hojas, String sePodaONo, float Ancho, String nombre, String tieneHojas, String clima_ideal, float alto_tallo) {
        super(nombre, tieneHojas, clima_ideal, alto_tallo);
        this.esDomestico = esDomestico;
        this.variedad = variedad;
        this.color_hojas = color_hojas;
        this.sePodaONo = sePodaONo;
        this.Ancho = Ancho;
    }

      

    public String getEsDomestico() {
        return esDomestico;
    }

    public String getVariedad() {
        return variedad;
    }

    public String getColor_hojas() {
        return color_hojas;
    }

    public String getSePodaONo() {
        return sePodaONo;
    }

    public float getAncho() {
        return Ancho;
    }

    public void setEsDomestico(String esDomestico) {
        this.esDomestico = esDomestico;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void setColor_hojas(String color_hojas) {
        this.color_hojas = color_hojas;
    }

    public void setSePodaONo(String sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    public void setAncho(float Ancho) {
        this.Ancho = Ancho;
    }

    @Override
    public String toString() {
        return super.toString() + "Arbusto{" + "esDomestico=" + esDomestico + ", variedad=" + variedad + ", color_hojas=" + color_hojas + ", sePodaONo=" + sePodaONo + ", Ancho=" + Ancho + '}';
    }
    
    
    
}
