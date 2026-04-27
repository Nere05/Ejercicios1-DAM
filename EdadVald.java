import java.util.Scanner;

public class EdadVald {

    // Edad Válida!
    // Pide una edad y valida con un if si está entre 0 y 120.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;
        System.out.println("Dame una edad: ");
        edad = sc.nextInt();

        if((edad >= 0) && (edad <= 120)){
            System.out.println("EDAD VÁLIDA!!!");
        } else {
            System.out.println("EDAD NO VÁLIDA!");
        }

    }

}
