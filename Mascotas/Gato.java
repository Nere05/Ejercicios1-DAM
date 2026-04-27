package Mascotas;

public class Gato extends Mascota{
    
    private String color;

    public Gato(String nombre, int edad, String color) {
        super(nombre, edad);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void ronronear(){
        System.out.println("El gato color " +getColor()+ " está ronroneando");
    }

    @Override
    public void hacerSonido(){
        System.out.println("¡Miaaauuuu!");
    }

}   
