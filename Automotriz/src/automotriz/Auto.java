package automotriz;

public class Auto extends Vehiculo implements Grande {
    
    private String materialAsientos;
    private int cantidadCaballos;
    
    public Auto(){
    }

    public Auto(String materialAsientos, int cantidadCaballos, String patente, int numChasis, int cantAsientos, String motor, String color, String marca, String modelo) {
        super(patente, numChasis, cantAsientos, motor, color, marca, modelo);
        this.materialAsientos = materialAsientos;
        this.cantidadCaballos = cantidadCaballos;
    }

    public String getMaterialAsientos() {
        return materialAsientos;
    }

    public int getCantidadCaballos() {
        return cantidadCaballos;
    }

    public void setMaterialAsientos(String materialAsientos) {
        this.materialAsientos = materialAsientos;
    }

    public void setCantidadCaballos(int cantidadCaballos) {
        this.cantidadCaballos = cantidadCaballos;
    }

    @Override
    public String toString() {
        return "Vehículo tipo " + "Auto " + super.toString() + "asientos de " + materialAsientos + " y" + cantidadCaballos + " caballos de fuerza";
    }

    @Override
    public String tipo() {
        return "Auto";
    }
    

    @Override
    public String esAptoDiscapacitado() {
        return "No";
    }

    
    public void Estacionar(){
        System.out.println("Soy un auto y me puedo estacionar");
    }
    
    public void transportoAMuchasPersonas(){
        System.out.println("Soy un auto y puedo transportar a muchas personas");
    }
    
    public void queHacen(){
        this.Estacionar();
        this.transportoAMuchasPersonas();
    }
    
    public int cilindrada(){
        return 0;
    };

    
    
}
