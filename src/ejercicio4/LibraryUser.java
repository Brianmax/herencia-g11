package ejercicio4;

import java.util.ArrayList;

public class LibraryUser {
    private String username;
    private String userId;
    private ArrayList<LibraryItem> loanedItems;
    private boolean estado;

    public LibraryUser(String username, String userId) {
        this.username = username;
        this.userId = userId;
        loanedItems = new ArrayList<>();
        estado = true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ArrayList<LibraryItem> getLoanedItems() {
        return loanedItems;
    }

    public void setLoanedItems(ArrayList<LibraryItem> loanedItems) {
        this.loanedItems = loanedItems;
    }
}
