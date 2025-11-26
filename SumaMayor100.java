import java.util.Scanner;

public class SumaMayor100 {

    // Pide números al usuario y ve sumándolos.
    // El bucle termina cuando la suma total sea mayor que 100.

    public static void main(String[] args) {

        Scanner bn = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;

        // System.out.println("dime un numerín: ");
        // n1 = bn.nextInt();
        // System.out.println("dime otro numerín: ");
        // n2 = bn.nextInt();

        int resultado = n1 + n2;

        while (resultado <= 100) {
            System.out.println("la suma de " + n1 + " + " + n2 + " es: " + resultado);

            System.out.println("dime un numerín: ");
            n1 = bn.nextInt();
            System.out.println("dime otro numerín: ");
            n2 = bn.nextInt();

            resultado = n1 + n2;
        }

        System.out.println("la suma de " + n1 + " + " + n2 + " es: " + resultado);
        System.out.println("Se acabó!!");

    }

}
