package herencia;

public class Admin extends Persona {
    private String cargo;
    public Admin(String nombre, String apellido, String correo, String cargo) {
        super(nombre, apellido, correo);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
