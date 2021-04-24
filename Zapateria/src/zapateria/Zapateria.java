package zapateria;

public class Zapateria {

    public static void main(String[] args) {
        
        Producto prod = new Producto ("Negro","Zara","Cuero","Chancleta",001,123,3000,37);
        //Producto prod2 = new Producto();
        String color = prod.getColor();
        System.out.println("El color del objeto es: "+ color);
        
    }
    
}
