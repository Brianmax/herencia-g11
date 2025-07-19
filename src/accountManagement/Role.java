package accountManagement;

public class Role {
    private String nombre;
    private Usuario usuario;

    void mostrarUsuario() {
        System.out.println(usuario.getNombre());
    }
}
