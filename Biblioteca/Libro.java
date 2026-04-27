package Biblioteca;

public class Libro {
    
    private String titulo;
    private double precioBase;
    
    public Libro(String titulo, double precioBase) {
        this.titulo = titulo;
        this.precioBase = precioBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double calcularPrecioFinal(){
        return precioBase;
    }

    public void mostrarInfo(){
        System.out.println("Título: " +getTitulo());
        System.out.println("Precio Base: " +getPrecioBase());
    }

    public void imprimirTicket(Libro libro){
        libro.mostrarInfo();
        System.out.println("El total a pagar es: " +libro.calcularPrecioFinal());
    }

}
