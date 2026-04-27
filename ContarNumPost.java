import java.util.Scanner;

public class ContarNumPost {

    /*
     * El usuario puede escribir números positivos o negativos.
     * El bucle termina cuando ingrese un número negativo.
     * Cuenta cuántos positivos escribió.
     */

    public static void main(String[] args) {

        Scanner bn = new Scanner(System.in);

        int n = 0;

        // System.out.println("ingresa un numerito: ");
        // n = bn.nextInt();

        while (n >= 0) {
            System.out.println("ingresa un numerito: ");
            n = bn.nextInt();
        }

        System.out.println("Uppss!! un número negativo... tenemos que parar chuli, lo sentimos.");

    }

}
