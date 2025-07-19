package ejercicio4;

public class DVD extends LibraryItem{
    private String director;
    private int duration;

    public DVD(String title, int itemId, String director, int duration) {
        super(title, itemId);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Item ID: " + itemId);
        System.out.println("Esta prestado: " + estaPrestado);
        System.out.println("Director: " + director);
        System.out.println("Duration: " + duration);
    }
}
