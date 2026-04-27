import java.util.Scanner;

public class ContarVocales {
    
    // Pide una palabra y muestra cuántas vocales tiene.

    public static void main(String[] args) {
        
        Scanner bn = new Scanner(System.in);

        System.out.println("Escribe una palabra: ");
        String palabra = bn.nextLine();

        palabra = palabra.toLowerCase();
        int contador = 0;

        for(int i = 0; i < palabra.length(); i++){
            char letra = palabra.charAt(i);

            if ((letra == 'a') || (letra == 'e') || (letra == 'i') || (letra == 'o') || (letra == 'u')) {
                contador++;
            }

        }

        System.out.println("Número de vocales: " +contador);

    }

}
