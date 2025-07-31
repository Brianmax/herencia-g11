package interfaces;

// no se puede instanciar
// no tiene constructor
// no tiene atributos
// puede tener metodos con implementacion

public interface Usuario {
    String ranking = "rank1"; // ==> static y final
    void login(String username, String password);
    void logout();
    void changePassword(String newPassword);

    default void printRanking() {
        System.out.println(ranking);
    }
}
