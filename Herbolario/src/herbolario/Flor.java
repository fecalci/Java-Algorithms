package herbolario;

public class Flor extends Planta {

    private String color_petalo, color_pistilo, variedad,estacion;
    private int cant_petalos;
    
    public Flor(){}

    public Flor(String color_petalo, String color_pistilo, String variedad, String estacion, int cant_petalos, String nombre, String tieneHojas, String clima_ideal, float alto_tallo) {
        super(nombre, tieneHojas, clima_ideal, alto_tallo);
        this.color_petalo = color_petalo;
        this.color_pistilo = color_pistilo;
        this.variedad = variedad;
        this.estacion = estacion;
        this.cant_petalos = cant_petalos;
    }

    public String getColor_petalo() {
        return color_petalo;
    }

    public String getColor_pistilo() {
        return color_pistilo;
    }

    public String getVariedad() {
        return variedad;
    }

    public String getEstacion() {
        return estacion;
    }

    public int getCant_petalos() {
        return cant_petalos;
    }

    public void setColor_petalo(String color_petalo) {
        this.color_petalo = color_petalo;
    }

    public void setColor_pistilo(String color_pistilo) {
        this.color_pistilo = color_pistilo;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public void setCant_petalos(int cant_petalos) {
        this.cant_petalos = cant_petalos;
    }

    @Override
    public String toString() {
        return super.toString()+ "Flor{" + "color_petalo=" + color_petalo + ", color_pistilo=" + color_pistilo + ", variedad=" + variedad + ", estacion=" + estacion + ", cant_petalos=" + cant_petalos + '}';
    }
    
    
    
}
