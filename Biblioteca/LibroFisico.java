package Biblioteca;

public class LibroFisico extends Libro{
    
    private double costoEnvio;

    public LibroFisico(String titulo, double precioBase, double costoEnvio) {
        super(titulo, precioBase);
        this.costoEnvio = costoEnvio;
    }

    @Override
    public double calcularPrecioFinal(){
        return getPrecioBase() + costoEnvio;
    }

    @Override 
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Costo Envío: " +costoEnvio);
    }

}
