package genericos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Punto2D<Integer> punto2D = new Punto2D<>(50, 50);
        Punto2D<Integer> punto2D2 = new Punto2D<>(5, 2);

        Punto2D<Float> floatPunto2D = new Punto2D<>(23.23f, 23.2f);

        Punto2D<String> stringPunto2D = new Punto2D<>("hola", "amigo");

        ArrayList<Integer> list = new ArrayList<>();

    }
}
