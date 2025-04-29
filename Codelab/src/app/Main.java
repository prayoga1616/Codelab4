public class Main {
    public static void main(String[] args) {
        // Create books
        library.Book fictionBook = new library.Fiction("Hainuwele", "Lilis Hu", "Dongeng");
        library.Book nonFictionBook = new library.NonFiction("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");

        // Display book info
        fictionBook.displayInfo();
        nonFictionBook.displayInfo();

        // Create members
        library.Member member1 = new library.Member("Farhan", "B220");
        library.Member member2 = new library.Member("Prayoga", "A220");

        // Borrowing books
        member1.borrowBook("Madilog");
        member2.borrowBook("Hainuwele", 7);

        // Returning books
        member1.returnBook("Madilog");
        member2.returnBook("Hainuwele");
    }
}