package newveterinaria;

public abstract class Mascota {
    
    private String  nombre,color, pelaje, raza;
    private char sexo;
    public int id=0;

    public Mascota() {
      
    }

    public Mascota(String nombre,String color, String pelaje, String raza, char sexo) {
        this.nombre = nombre;
        this.color = color;
        this.pelaje = pelaje;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Mascota [" +id + "]: " + "\nNombre: " + nombre + "\nColor: " + color + "\nPelaje: " + pelaje + "\nRaza: " + raza + "\nSexo: " + sexo;
    }
    
    public abstract void queCome();  
 
    public abstract void queHacen();
}
