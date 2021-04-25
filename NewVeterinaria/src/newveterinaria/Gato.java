package newveterinaria;

public class Gato extends Mascota implements Felino {

   private String cazador, garras, mimoso;
   
   public Gato(){}

    public Gato(String cazador, String garras, String mimoso, String nombre, String color, String pelaje, String raza, char sexo) {
        super(nombre, color, pelaje, raza, sexo);
        this.cazador = cazador;
        this.garras = garras;
        this.mimoso = mimoso;
    }

    public String getCazador() {
        return cazador;
    }

    public void setCazador(String cazador) {
        this.cazador = cazador;
    }

    public String getGarras() {
        return garras;
    }

    public void setGarras(String garras) {
        this.garras = garras;
    }

    public String getMimoso() {
        return mimoso;
    }

    public void setMimoso(String mimoso) {
        this.mimoso = mimoso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCazador: " + cazador + "\nMimoso: " + mimoso + "\nGarras: "+ garras;
    }
   
    
    @Override
    public void queCome() {
        System.out.println("El gato "+ super.getNombre() + "come gatarina");
    }

    @Override
    public void maullar() {
        System.out.println("soy un gato llamado "+ super.getNombre()+ " y maullo");
    }
    
      @Override
    public void queHacen(){
        this.maullar();
    }
  
}
