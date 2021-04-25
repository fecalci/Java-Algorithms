package newveterinaria;

public class Perro extends Mascota implements Canino, Amoroso{
    
    private String pulgas, vacunado;
    private int edad;

    public Perro() {
    }

    public Perro(String pulgas, String vacunado, int edad, String nombre,String color, String pelaje, String raza, char sexo) {
        super(nombre,color, pelaje, raza, sexo);
        this.pulgas = pulgas;
        this.vacunado = vacunado;
        this.edad = edad;       
    }

    public String getPulgas() {
        return pulgas;
    }

    public void setPulgas(String pulgas) {
        this.pulgas = pulgas;
    }

    public String getVacunado() {
        return vacunado;
    }

    public void setVacunado(String vacunado) {
        this.vacunado = vacunado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return  super.toString()+"\nPulgas: " +pulgas+ "\nVacunado: " +vacunado +"\nEdad: "+edad;
    }

   
    
    @Override
    public void queCome() {
        System.out.println("El perro "+ super.getNombre() +" come perrarina");
    } 

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Ladrar() {
        System.out.println("soy un perro llamado " + super.getNombre()+" y yo ladro");
    }

    @Override
    public void doyAmor() {
        System.out.println("Soy un perro amoroso");
    }
    
    @Override
    public void queHacen(){
        this.Ladrar();
    }

}