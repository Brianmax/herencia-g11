package herencia;

public class Alumno extends Persona {
    private float nota;
    public Alumno(String nombre, String apellido, String correo, float nota) {
        super(nombre, apellido, correo);
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public void imprimir() {
        System.out.println("Mi noombre: " + nombre);
        System.out.println("Mi apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("Nota:" + nota);
    }
}
