import java.util.Scanner;

public class NumMultip {
    
    // Múltiplos de 3 o 5
    // Pide un número y di si es múltiplo de 3 o de 5 (usa ||).

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Dime un número: ");
        n = sc.nextInt();

        if ((n%3 == 0) || (n%5 == 0)) {
            System.out.println("Es múltiplo");
        } else {
            System.out.println("No es múltiplo");
        }

    }

}
