package herbolario;

import java.util.Scanner;

public class Arbol extends Planta implements doyFrutos {
    
    private String variedad, tipo_tronco, color, tipo_hojas;
    private float radio_tronco;
    
    public Arbol(){}

    public Arbol(String variedad, String tipo_tronco, String color, String tipo_hojas, float radio_tronco, String nombre, String tieneHojas, String clima_ideal, float alto_tallo) {
        super(nombre, tieneHojas, clima_ideal, alto_tallo);
        this.variedad = variedad;
        this.tipo_tronco = tipo_tronco;
        this.color = color;
        this.tipo_hojas = tipo_hojas;
        this.radio_tronco = radio_tronco;
    }
    
    public Arbol inputData(){
        
        Arbol bol;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del arbol");
        String nombre = lector.next();

        System.out.println("Ingrese si tiene hojas SI/NO");
        String tieneHojas = lector.next();                        

        System.out.println("Ingrese el clima ideal");
        String clima_ideal = lector.next();

        System.out.println("Ingrese el alto del tallo");
        float alto_tallo = lector.nextFloat();

        System.out.println("Ingrese el color del arbol");
        String color = lector.next();

        System.out.println("Ingrese el tipo de tronco");
        String tipo_tronco = lector.next();

        System.out.println("Ingrese el radio del tronco");
        float radio_tronco = lector.nextFloat();

        System.out.println("Ingrese el tipo de hojas");
        String tipo_hojas = lector.next();                          

        System.out.println("Ingrese la variedad");
        String variedad = lector.next();

        bol = new Arbol(variedad, tipo_tronco, color, tipo_hojas, radio_tronco, nombre, tieneHojas, clima_ideal, alto_tallo); 
        
        return bol;
        
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
        return "Arbol" + " id: " + super.id + ", "+ super.toString() + " de variedad " + variedad + " con tipo de tronco " + tipo_tronco + ", color " + color + " tiene hojas " + tipo_hojas + " y el radio del tronco es " + radio_tronco;
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un arbol");
    }

    @Override
    public String queSoy() {
        return "Arbol";
    }

    @Override
    public void doyFrutos() {
        System.out.println("Soy un arbol y doy frutos");
    }

    @Override
    public void queHacen() {
        this.doyFrutos();
    }
    
    
    
    
    
    
    
    
    
}
