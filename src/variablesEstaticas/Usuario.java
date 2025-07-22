package variablesEstaticas;

public class Usuario {
    static int numUsers = 0;
    private String username;
    private String password;
    private String email;

    public Usuario(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        numUsers++;
    }

    public static int getNumUsers() {
        return numUsers;
    }

    public static void setNumUsers(int numUsers) {
        Usuario.numUsers = numUsers;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
