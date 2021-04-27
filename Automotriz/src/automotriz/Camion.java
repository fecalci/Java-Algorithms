package automotriz;

public class Camion extends Vehiculo implements Grande{
    
    private String tieneAcoplado;
    private int cantidadEjes;
    
    public Camion(){}

    public Camion(String tieneAcoplado, int cantidadEjes, String patente, int numChasis, int cantAsientos, String motor, String color, String marca, String modelo) {
        super(patente, numChasis, cantAsientos, motor, color, marca, modelo);
        this.tieneAcoplado = tieneAcoplado;
        this.cantidadEjes = cantidadEjes;
    }

    public String getTieneAcoplado() {
        return tieneAcoplado;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setTieneAcoplado(String tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    @Override
    public String toString() {
        return "Vehículo tipo " + "Camion " + super.toString() + tieneAcoplado + " tiene acoplado" + " y tiene " + cantidadEjes + " ejes";
    }
    
   
    
    @Override
    public void Estacionar() {
        System.out.println("Soy un camión y me puedo estacionar");
    }    
    
    public void transportoAMuchasPersonas(){
        System.out.println("Soy un camión y transporto a muchas personas");
    }
    
    public void queHacen(){
        this.Estacionar();
        this.transportoAMuchasPersonas();
    }    
    

    @Override
    public void soyVehiculo() {
        System.out.println("Hola soy un camión y hago viajes largos");
    }
    
    
    
    
    
}
