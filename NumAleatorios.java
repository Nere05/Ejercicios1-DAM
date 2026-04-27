import java.util.Scanner;

public class NumAleatorios {
    
    // Número aleatorio del 1 al 10
    // Genera un número aleatorio entre 1 y 10 y muéstralo por consola.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = (int)(Math.random() * 10) + 1;
    
        System.out.println("Número aleatorio: " +n);

    }

}
