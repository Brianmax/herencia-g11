package accountManagement;

public class Usuario {
    private String nombre; // default
    private String apellido;
    private String correo;
    private String contrasena;
    private int edad;

    public Usuario(String nombre, String apellido, String correo, String contrasena, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void mostrarUsuario() {
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(correo);
        System.out.println(contrasena);
        System.out.println(edad);
    }
}
