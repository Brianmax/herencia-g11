package interfaces;

public class UsuarioEstudiante implements Usuario{

    private float promedio;

    @Override
    public void login(String username, String password) {
        System.out.println("Login Usuario estudiante");
    }

    @Override
    public void logout() {
        System.out.println("Logout Usuario estudiante");
    }

    @Override
    public void changePassword(String newPassword) {
        System.out.println("Change Password Usuario estudiante");
    }
}
