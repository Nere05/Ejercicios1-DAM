package Mascotas;

public class Perro extends Mascota{
    
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void moverCola(){
        System.out.println("El perro " + getNombre() + " está moviendo la cola");
    }

    @Override
    public void hacerSonido(){
        System.out.println("¡Guau, Guau!");
    }

}
