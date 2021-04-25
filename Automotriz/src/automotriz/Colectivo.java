
package automotriz;

public class Colectivo extends Vehiculo implements Grande {
    
    private String aptoDiscapacitados, poseeLectorSube, tipoColectivo;
    
    
    public Colectivo(){}

    public Colectivo(String aptoDiscapacitados, String poseeLectorSube, String tipoColectivo, String patente, int numChasis, int cantAsientos, String motor, String color, String marca, String modelo) {
        super(patente, numChasis, cantAsientos, motor, color, marca, modelo);
        this.aptoDiscapacitados = aptoDiscapacitados;
        this.poseeLectorSube = poseeLectorSube;
        this.tipoColectivo = tipoColectivo;
    }

    public String getAptoDiscapacitados() {
        return aptoDiscapacitados;
    }

    public String getPoseeLectorSube() {
        return poseeLectorSube;
    }

    public String getTipoColectivo() {
        return tipoColectivo;
    }

    public void setAptoDiscapacitados(String aptoDiscapacitados) {
        this.aptoDiscapacitados = aptoDiscapacitados;
    }

    public void setPoseeLectorSube(String poseeLectorSube) {
        this.poseeLectorSube = poseeLectorSube;
    }

    public void setTipoColectivo(String tipoColectivo) {
        this.tipoColectivo = tipoColectivo;
    }

    
    @Override
    public String toString() {
        return "Vehículo tipo " + "Colectivo " + super.toString() + aptoDiscapacitados + " es apto discapacitados, " + poseeLectorSube + " posee lector sube " + "y es un colectivo tipo " + tipoColectivo;
    }
    
    
    @Override
    public String tipo() {
        return "Colectivo";
    }    

    @Override
    public String esAptoDiscapacitado() {
        return aptoDiscapacitados;
    }
    
    
    @Override
    public void Estacionar() {
        System.out.println("Soy un colectivo y me puedo estacionar");
    }    
    
    public void transportoAMuchasPersonas(){
        System.out.println("Soy un colectivo y transporto a muchas personas");
    }
  
    public void queHacen(){
        this.Estacionar();
        this.transportoAMuchasPersonas();
    }    
    
    
    public int cilindrada(){
        return 0;
    };    
    
    
    
    
}
