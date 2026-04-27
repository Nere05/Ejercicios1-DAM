package Mascotas;

public class Mascota {
    
    private String nombre;
    private int edad;
    
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void hacerSonido() {
        System.out.println("La mascota hace un sonido genérico");
    }
    
    public void comer(){
        System.out.println(getNombre() + " está comiendo");
    }

}
