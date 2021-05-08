package herbolario;

import java.util.Scanner;

public class Flor extends Planta implements meRegalan{

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
    
    
    public Flor inputData(){
        
        Flor f;
        
        Scanner lector = new Scanner(System.in);
    
        System.out.println("Ingrese el nombre de la flor");
        String nombre = lector.next();

        System.out.println("Ingrese si tiene hojas SI/NO");
        String tieneHojas = lector.next();                        

        System.out.println("Ingrese el clima ideal");
        String clima_ideal = lector.next();

        System.out.println("Ingrese el alto del tallo");
        float alto_tallo = lector.nextFloat();

        System.out.println("Ingrese el color del pétalo");
        String color_petalo = lector.next();

        System.out.println("Ingrese el color del pistillo");
        String color_pistilo = lector.next();

        System.out.println("Ingrese la cantidad de petalos");
        int cant_petalos = lector.nextInt();                          

        System.out.println("Ingrese la variedad");
        String variedad = lector.next();

        System.out.println("Ingrese la estacion a la que pertenece");
        String estacion = lector.next();      

        f = new Flor(color_petalo, color_pistilo, variedad, estacion, cant_petalos, nombre, tieneHojas, clima_ideal, alto_tallo);   
        
        return f;
    
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
        return "Flor " + "id: " + super.id + ", "+ super.toString() + " con petalos color " + color_petalo + ", pistillos color " + color_pistilo + " de variedad " + variedad + " perteneciente a estación " + estacion + " y con una cantidad de pétalos de " + cant_petalos;
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy una flor");
    }

    @Override
    public String queSoy() {
        return "Flor";
    }
    
    public void meRegalan(){
        System.out.println("Soy una flor y me regalan a menudo");
    }
    
    public void queHacen(){
        this.meRegalan();
    }
    
    
    
    
    
}
