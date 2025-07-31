package ejercicio7;

public class SoloEstudiante extends Persona implements Estudiante {

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando Solo Estudiante");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando Solo Estudiante");
    }

    // Estudiante
    @Override
    public void matricularCurso() {

    }

    @Override
    public void entregarTarea() {

    }
}
