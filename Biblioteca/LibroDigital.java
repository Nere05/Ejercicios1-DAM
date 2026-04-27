package Biblioteca;

public class LibroDigital extends Libro{
    
    private String linkDescarga;

    public LibroDigital(String titulo, double precioBase, String linkDescarga) {
        super(titulo, precioBase);
        this.linkDescarga = linkDescarga;
    }

    @Override
    public double calcularPrecioFinal(){
        return getPrecioBase() * 0.95;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Link Descarga: " +linkDescarga);
    }

}
