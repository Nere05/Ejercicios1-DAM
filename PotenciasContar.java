import java.util.Scanner;

public class PotenciasContar {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int resultado = 0;
        for(int i = 1; i<=10; i++){
            resultado = (int) Math.pow(i,2);
            System.out.println(i+ "^2 = " +resultado);
        }

    }

}
