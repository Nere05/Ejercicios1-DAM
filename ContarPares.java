import java.util.Scanner;

public class ContarPares {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // pares
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 2);
        }

        System.out.println("--------------------------");

        // impares
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }

    }

}
