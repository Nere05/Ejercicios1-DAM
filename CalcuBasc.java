import java.util.Scanner;

public class CalcuBasc {
    
    // calculadora básica! 
    // Pide dos números por teclado y muestra su suma, resta, multiplicación, división y módulo (%)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        
        System.out.println("Dame un número: ");
        n1 = sc.nextInt();
        System.out.println("Dame otro número: ");
        n2 = sc.nextInt();

        int suma; 
        suma = n1 + n2;
        System.out.println("La suma da: " +suma);

        int resta;
        resta = n1 - n2;
        System.out.println("La resta da: " +resta);

        int multip;
        multip = n1 * n2;
        System.out.println("La multiplicación da: " +multip);

        int div;
        div = n1 / n2;
        System.out.println("La división da: " +div);

        int mod; 
        mod = n1 % n2;
        System.out.println("El resto de la división es: " +mod);


    }

}
