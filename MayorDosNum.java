import java.util.Scanner;

public class MayorDosNum {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1;
        int n2;

        System.out.println("Dame un número: ");
        n1 = sc.nextInt();
        System.out.println("Dame otro número: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " es mayor");
        } else if (n2 > n1){
            System.out.println(n2 + " es mayor");
        } else {
            System.out.println("son iguales");
        }

    }
    
}
