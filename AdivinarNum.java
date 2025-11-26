import java.util.Scanner;

public class AdivinarNum {

    /*
     * Genera un número aleatorio (1–10).
     * El usuario adivina:
     * Mientras no acierte, sigue pidiendo un número.
     */

    public static void main(String[] args) {

        Scanner bn = new Scanner(System.in);

        int n;
        int numRandom = (int) Math.random() * 11;

        System.out.println("dime un numerín: ");
        n = bn.nextInt();

        while (n != numRandom) {
            numRandom = (int) (Math.random() * 11);
            System.out.println("dime un numerín: ");
            n = bn.nextInt();
        }

        System.out.println("Acertaste!! Felicidades!");

    }

}
