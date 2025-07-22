package clasesAbstractas;

// no se puede instanciar
// puede tener metodos con implementacion
public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double area();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
