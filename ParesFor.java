import java.util.Scanner;

public class ParesFor {

    // Muestra todos los números pares entre 1 y 50 usando un for.

    public static void main(String[] args) {

        Scanner bn = new Scanner(System.in);

        for(int i = 2; i <= 50; i+=2){
            System.out.println(i);
        }

    }

}
