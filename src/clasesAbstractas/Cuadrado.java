package clasesAbstractas;

public class Cuadrado extends Figura{
    private double lado;
    public Cuadrado(String color, double lado) {
        super(color);
        this.color = color;
    }
    @Override
    public double area() {
        return Math.pow(lado, 2);
    }
}
