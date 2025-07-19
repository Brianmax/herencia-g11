package ejercicio4;

import java.util.ArrayList;
import java.util.List;

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

    public void loanItem(int itemId, int userId) {
        // implementar la logica para determinar si un item se puede prestar
    }
}
