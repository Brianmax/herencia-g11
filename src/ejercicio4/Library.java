package ejercicio4;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items = new ArrayList<>();
    private ArrayList<LibraryUser> users = new ArrayList<>();

    public void addItem(LibraryItem newItem) {
        int id = newItem.getItemId();

        for (LibraryItem item: items) {
            if (item.getItemId() == id) {
                System.out.println("El item ya se encuentra registrado");
                return;
            }
        }
        items.add(newItem);
    }

    public void addUser(LibraryUser newUser) {
        users.add(newUser);
    }

    public void loanItem(int itemId, String userId) {
        // validar la existencia del usuario y el item
        LibraryItem item = getItem(itemId);
        LibraryUser user = getUser(userId);

        if (user == null || item == null) {
            System.out.println("Usuario o item no existe");
            return;
        }

        // validar disponibilidad del item
        if (item.estaPrestado) {
            System.out.println("El item no se encuentra disponible");
            return;
        }

        // operacion de prestamo
        user.getLoanedItems().add(item);
        item.setEstaPrestado(true);
        System.out.println("El item se presto de manera satisfactoria");
    }

    public void returnItem(int itemId, String userId) {
        // TODO: Implementar la logica necesaria para retornar un item
    }

    // metodo que imprime la informacion de los items
    // true: imprime todos los items (disponibles/no disponibles)
    // false: imprime solo los items disponibles
    public void showItems(boolean condicion) {
        if (condicion) {
            for (LibraryItem item: items) {
                item.showDetails();
                System.out.println("++++++++++++++++++++++++++++++++++");
            }
        } else {
            for (LibraryItem item: items) {
                if (!item.isEstaPrestado()) {
                    item.showDetails();
                    System.out.println("++++++++++++++++++++++++++++++++++");
                }
            }
        }
    }

    // metodo para obtener un item por su id
    // itera sobre el array de items y en caso haya una coincidencia con el id proporcionado
    // retorna el item, caso contrario retorna null
    private LibraryItem getItem(int itemId) {
        for (LibraryItem item: items) {
            if (item.getItemId() == itemId) {
                return item;
            }
        }
        return null;
    }

    // metodo para obtener un usuario por su id
    // itera sobre el array de users y en caso haya una coincidencia con el id proporcionado
    // retorna el usuario, caso contrario retorna null
    private LibraryUser getUser(String userId) {
        for (LibraryUser user: users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
}
