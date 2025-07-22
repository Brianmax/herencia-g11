package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        DVD dvd1 = new DVD("Inception", 101, "Christopher Nolan", 148);
        DVD dvd2 = new DVD("The Matrix", 102, "The Wachowskis", 136);
        DVD dvd3 = new DVD("Interstellar", 103, "Christopher Nolan", 169);

        Book book1 = new Book("1984", 201, "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", 202, "Harper Lee");
        Book book3 = new Book("Brave New World", 203, "Aldous Huxley");

        LibraryUser user1 = new LibraryUser("alice", "U001");
        LibraryUser user2 = new LibraryUser("bob", "U002");
        LibraryUser user3 = new LibraryUser("carol", "U003");
        LibraryUser user4 = new LibraryUser("david", "U004");
        LibraryUser user5 = new LibraryUser("eve", "U005");

        library.addItem(dvd1);
        library.addItem(dvd2);
        library.addItem(dvd3);
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        library.addUser(user1);
        library.addUser(user2);
        library.addUser(user3);
        library.addUser(user4);
        library.addUser(user5);

        while(true) {
            System.out.println("Ingrese la opcion: ");
            System.out.println("1. Mostrar items disponibles");
            System.out.println("2. Prestar un item");
            System.out.println("3. Retornar un item");
            System.out.println("4. Salir");
            System.out.println("=================================================");

            int opcion = sc.nextInt();
            if (opcion == 1) {
                library.showItems(false);
            } else if (opcion == 2) {
                System.out.println("Ingrese el ID del item");
                int itemId = sc.nextInt();
                System.out.println("Ingrese el ID del usuario");
                String userId = sc.next();
                library.loanItem(itemId, userId);
            } else if (opcion == 3) {
                System.out.println("Ingrese el ID del item");
                int itemId = sc.nextInt();
                System.out.println("Ingrese el ID del usuario");
                String userId = sc.next();
                library.returnItem(itemId, userId);
            }

            System.out.println("=================================================");
        }

    }
}
