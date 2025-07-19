package ejercicio4;

public class LibraryItem {
    protected String title;
    protected Integer itemId;
    protected boolean estaPrestado;

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        estaPrestado = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean isEstaPrestado() {
        return estaPrestado;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("Esta prestado: " + estaPrestado);
    }
}
