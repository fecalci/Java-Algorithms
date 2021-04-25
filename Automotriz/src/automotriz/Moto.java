package automotriz;

public class Moto extends Vehiculo implements Chico {
    
    private int cilindrada;
    private String materialManubrio;    
    
    public Moto(){
    }

    public Moto(int cilindrada, String materialManubrio, String patente, int numChasis, int cantAsientos, String motor, String color, String marca, String modelo) {
        super(patente, numChasis, cantAsientos, motor, color, marca, modelo);
        this.cilindrada = cilindrada;
        this.materialManubrio = materialManubrio;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getMaterialManubrio() {
        return materialManubrio;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setMaterialManubrio(String materialManubrio) {
        this.materialManubrio = materialManubrio;
    }

    @Override
    public String toString() {
        return "Vehículo tipo " + "Moto " + super.toString() + " cilindrada " + cilindrada + " y manubrio de " + materialManubrio;
    }
    
  
    @Override
    public String tipo() {
        return "Moto";
    }    
    
    @Override
    public String esAptoDiscapacitado() {
        return "No";
    }
    
    
    @Override
    public void Estacionar() {
        System.out.println("Soy una moto y me puedo estacionar");
    }
    
    public void viajaUnaPersona(){
        System.out.println("Soy una moto y solo pueden viajar 2 personas");
    }
    
    
    public void queHacen(){
        this.Estacionar();
        this.viajaUnaPersona();
    }    
    
    public int cilindrada(){
        return this.getCilindrada();
    }
    
}
