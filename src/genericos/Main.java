package genericos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListaGenerica<Double> elementos = new ListaGenerica<>();

        elementos.add(29.3);
        elementos.add(33.3);
        elementos.add(12.3);
        elementos.add(94.3);
        elementos.add(6.3);
        elementos.add(7.3);

        System.out.println(elementos.get(0));

    }
}
