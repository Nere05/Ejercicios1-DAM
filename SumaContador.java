import java.util.Scanner;

public class SumaContador {

    // Suma de los primeros N números.Pide un número N y calcula la suma de todos
    // los números del 1 al N.

    public static void main(String[] args) {

        Scanner bn = new Scanner(System.in);

        int n;
        int suma = 0;

        System.out.println("Dame un numerito: ");
        n = Integer.parseInt(bn.nextLine());

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        System.out.println("Suma de todos los números del 1 al N: " + suma);

    }
    
}
