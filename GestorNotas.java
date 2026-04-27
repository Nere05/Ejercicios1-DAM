import java.util.Scanner;

public class GestorNotas {

    public static int pedirNota() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una nota: ");
        return sc.nextInt();
    }

    public static int calcularMedia(int n1, int n2, int n3) {

        int media = (n1 + n2 + n3)/3;

        return media;
    }

    public static int esAprobado(int media){

        if (media >=5 && media <=10) {
            System.out.println("Estás aprobado!!!");
        } else if (media < 5 && media >=0) {
            System.out.println("Has suspendido");
        } else {
            System.out.println("Nota no válida!");
        }
        
        return media;
    }

    public static void main(String[] args) {

        int not1, not2, not3;

        not1 = pedirNota();
        not2 = pedirNota();
        not3 = pedirNota();

        int notmed = calcularMedia(not1, not2, not3);
        System.out.println("La nota media de las calificaciones es: " + notmed);

        int aprobado = esAprobado(notmed);

    }

}
