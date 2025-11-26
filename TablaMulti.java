import java.util.Scanner;

public class TablaMulti {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("dame un numerito: ");
        n = sc.nextInt();

        System.out.println("tabla de multiplicar de " +n+ ":");
        System.out.println("---------------------------");

        for(int i = 0; i <= 10; i++){
            int resultado = n * i;
            System.out.println(n + "*" + i + "=" +resultado);
        }

    }

}
