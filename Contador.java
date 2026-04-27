import java.util.Scanner;

public class Contador {
    
    // Contador de 1 a N
    // Pide un número N y muestra los números del 1 hasta N con un for.

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Pon un número: ");
        n = sc.nextInt();

        System.out.println("---------------------------");

        for(int i=n; i <= 100; i++){
            System.out.println(i);
        } 

    }

}
