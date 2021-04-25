package herbolario;

import java.util.Scanner;

    public class Arbusto extends Planta {

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
    
    
    public Arbusto inputData(){
        
            Arbusto a;
            
            Scanner lector = new Scanner(System.in);
            
            System.out.println("Ingrese el nombre del arbusto");
            String nombre = lector.next();

            System.out.println("Ingrese si tiene hojas SI/NO");
            String tieneHojas = lector.next();

            if(tieneHojas.equalsIgnoreCase("Si")){
                System.out.println("Ingrese el color de las hojas"); 
                color_hojas = lector.next();
            }
            else{
                color_hojas = "-";
            }

            System.out.println("Ingrese el clima ideal");
            String clima_ideal = lector.next();

            System.out.println("Ingrese el alto del tallo");
            float alto_tallo = lector.nextFloat();

            System.out.println("Ingrese si es doméstico SI/NO");
            esDomestico = lector.next();

            System.out.println("Ingrese la variedad");
            variedad = lector.next();

            System.out.println("Ingrese si se poda o no SI/NO");
            sePodaONo = lector.next();

            System.out.println("Ingrese el ancho del arbusto");
            Ancho = lector.nextFloat();

            a = new Arbusto(esDomestico,variedad, color_hojas, sePodaONo, Ancho, nombre, tieneHojas, clima_ideal, alto_tallo);
     
            return a;
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
        return "Arbusto " + "id: " + ", " +super.id + " " + super.toString() + " "+  esDomestico + " es doméstico, " +"de variedad " + variedad + " con hojas color " + color_hojas  + " "+ sePodaONo+  " se poda y tiene un ancho de " + Ancho;
    }

    
    @Override
    public void saludar() {
        System.out.println("Hola soy un arbusto");
    }

    @Override
    public String queSoy() {
        return "Arbusto";
    }
    
    public void doyFrutos(){
        System.out.println("Soy un arbusto y doy frutos");
    }

    @Override
    public void soyVenenoso() {
        System.out.println("Soy un arbusto y soy venenoso");
    }
    
    
    
    
    
    
    
}
