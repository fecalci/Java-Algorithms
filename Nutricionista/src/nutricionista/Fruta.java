package nutricionista;
import java.util.Scanner;

public class Fruta {
    
    /*
    nombre, color, calorías, tipoCascara, esComestible (tener en cuenta
    todos sus atributos, constructores, métodos getters y setters).
     */
    public Fruta() {
        
    }

    
    private String nombre, color, tipoCascara,esComestible;
    private float calorias;
    public int id = 0;

    public Fruta(String nombre, String color, String tipoCascara, float calorias, String esComestible) {
        this.nombre = nombre;
        this.color = color;
        this.tipoCascara = tipoCascara;
        this.calorias = calorias;
        this.esComestible = esComestible;
    }
    
    
    public Fruta inputData(){
        
            Fruta f;
            
            Scanner lector = new Scanner(System.in);
            
            System.out.println("Ingrese el nombre de la fruta");
            String nombre = lector.next();
            
            System.out.println("Ingrese el color de la fruta");
            String color = lector.next();            
                      
            
            System.out.println("Ingrese el tipo de cáscara");
            String tipoCascara = lector.next();
            
            System.out.println("Ingrese las calorías de la fruta");
            float calorias = lector.nextFloat(); 
            
            System.out.println("Ingrese si es comestible");
            String esComestible = lector.next();
            
            f = new Fruta(nombre,color,tipoCascara,calorias,esComestible);
     
            return f;
    }    
    
    
    //------------Getter--------------

    
    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getTipoCascara() {
        return tipoCascara;
    }

    public float getCalorias() {
        return calorias;
    }

    public String getesComestible() {
        return esComestible;
    }
   
       
    
    //------------Setter--------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoCascara(String tipoCascara) {
        this.tipoCascara = tipoCascara;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }

    public void setEsComestible(String esComestible) {
        this.esComestible = esComestible;
    }

    @Override
    public String toString() {
        return id + ": " + nombre + " de color " + color + " con una cascara " + tipoCascara + ", " + esComestible + " es comestible"  + " y tiene " + calorias + " calorias";
    }
    
    
    
    
    
    
}
