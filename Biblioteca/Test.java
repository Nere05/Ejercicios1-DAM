package Biblioteca;

public class Test {
    
    public static void main(String[] args) {
        
        Libro libro = new Libro("El Principito", 20.0);
        LibroDigital libroDigital = new LibroDigital("Clean Code", 30.0, "https://descargas.com/cleancode");
        LibroFisico libroFisico = new LibroFisico("1984", 25.0, 4.5);

        libro.mostrarInfo();
        System.out.println("Precio Final: " + libro.calcularPrecioFinal());
        System.out.println();

        libroDigital.mostrarInfo();
        System.out.println("Precio Final: " + libroDigital.calcularPrecioFinal());
        System.out.println();

        libroFisico.mostrarInfo();
        System.out.println("Precio Final: " + libroFisico.calcularPrecioFinal());

    }

}
