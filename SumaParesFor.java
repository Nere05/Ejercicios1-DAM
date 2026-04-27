import java.util.Scanner;

public class SumaParesFor {
    
    // Pide al usuario un número N y calcula la suma de todos los números pares desde 1 hasta N.

    public static void main(String[] args) {

        Scanner bn = new Scanner(System.in);

        int n;
        System.out.println("dime un numerito: ");
        n = Integer.parseInt(bn.nextLine());
        System.out.println("-------------------");
        int suma = 0;

        for(int i = 2; i <= n; i+=2){
            System.out.println(i);
            suma += i;
        }

        System.out.println("La suma de estos números pares es: " +suma);

    }

}
