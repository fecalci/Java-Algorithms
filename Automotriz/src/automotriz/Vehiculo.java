
package automotriz;


public abstract class Vehiculo {
       
    private int numChasis,cantAsientos;
    private String color, marca, modelo ,patente, motor;
    public int id = 0;
    
    public Vehiculo(){       
    }

    public Vehiculo(String patente, int numChasis, int cantAsientos, String motor, String color, String marca, String modelo) {
        this.patente = patente;
        this.numChasis = numChasis;
        this.cantAsientos = cantAsientos;
        this.motor = motor;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public int getNumChasis() {
        return numChasis;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public String getMotor() {
        return motor;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setNumChasis(int numChasis) {
        this.numChasis = numChasis;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "id:" + id + " " + "con numero de chasis " + numChasis + ", cantidad de asientos " + cantAsientos + ", color " + color + ", marca " + marca + " modelo " + modelo + " patente " + patente + ", motor " + motor;
    }
    
    
    public abstract String tipo();
    
    public abstract String esAptoDiscapacitado();
    
    public abstract void queHacen();   
    
    public abstract int cilindrada();
    
    
    
}
