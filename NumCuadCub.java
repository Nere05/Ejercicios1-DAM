import java.util.Scanner;

public class NumCuadCub {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        
        System.out.println("dime un número: ");
        n = sc.nextInt();

        System.out.println("su cuadrado es: " + (int) Math.pow(n, 2));
        System.out.println("su cubo es: " + (int) Math.pow(n, 3));
        
    }

}
