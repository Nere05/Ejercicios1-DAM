package Mascotas;

import java.util.ArrayList;

public class TestAnimales {
    
    public static void main(String[] args) {

        ArrayList<Mascota> animalitos = new ArrayList<>();

        Perro can1 = new Perro("Chispy", 6, "Mezcla");
        animalitos.add(can1);

        Gato gat1 = new Gato("Michu", 2, "Naranja");
        animalitos.add(gat1);

        for (int i = 0; i < animalitos.size(); i++) {
            animalitos.get(i).hacerSonido();
        }
        
    }

}
