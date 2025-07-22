package clasesAbstractas;

public class Main {
    public static void main(String[] args) {
        Figura figura1 = new Circulo("rojo", 15);

        figura1.area();
        figura1.getColor();
        figura1.setColor("azul");
    }
}
