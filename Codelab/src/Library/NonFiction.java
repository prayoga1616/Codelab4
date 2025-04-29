package library;

public class NonFiction extends library.Book {
    private String field;

    public NonFiction(String title, String author, String field) {
        super(title, author);
        this.field = field;
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku Non-Fiksi: " + title + " oleh " + author + " (Bidang: " + field + ")");
    }
}