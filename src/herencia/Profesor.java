package herencia;

public class Profesor extends Persona {
    private float salario;

    public Profesor(String nombre, String apellido, String correo, float salario) {
        super(nombre, apellido, correo);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("Salario: " + salario);
    }
}
