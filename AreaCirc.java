import java.util.Scanner;

public class AreaCirc {
    
    // Método Área Círculo
    // Crea un método que reciba un radio y devuelva el área de un círculo usando Math.PI y Math.pow.


    public static int AreaCircu (int radio){
        int area;

        area =  (int) (Math.PI * Math.pow(radio, 2));

        return area;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int radio;
        System.out.println("Dame un radio: ");
        radio = sc.nextInt();

        System.out.println("El área del círculo es: " +AreaCircu(radio));

    }

}
