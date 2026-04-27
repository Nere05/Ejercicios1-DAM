import java.util.Scanner;

public class dowhilePedirNum {

    // Con un do-while, pide un número y repite mientras esté fuera del rango 1–5.
    
    public static void main(String[] args) {
        
        Scanner bn = new Scanner(System.in);
        int n;

        do{

            System.out.println("dame un numerito: ");
            n = bn.nextInt();

        } while(n > 5);

    }

}
