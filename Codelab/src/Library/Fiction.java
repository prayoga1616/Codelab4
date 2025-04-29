package library;

public class Fiction extends library.Book {
    private String genre;

    public Fiction(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Fiksi: " + title + " oleh " + author + " (Genre: " + genre + ")");
    }
}