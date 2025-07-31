import accountManagement.Usuario;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
                "George",
                "Maxi",
                "gmaxi@gmail.com",
                "1234",
                27
        );

        Usuario usuario2 = new Usuario(
                "Sheyla",
                "Beltran",
                "sbeltran@gmail.com",
                "12347",
                28
        );
        usuario.mostrarUsuario();
        usuario2.mostrarUsuario();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);

    }
}
