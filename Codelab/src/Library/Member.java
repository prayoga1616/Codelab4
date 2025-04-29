package library;

public class Member implements library.BookLoan {
    private String name;
    private String memberID;

    public Member(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
    }

    public void borrowBook(String title) {
        System.out.println(name + " meminjam buku berjudul: " + title);
    }

    public void borrowBook(String title, int duration) {
        System.out.println(name + " meminjam buku \"" + title + "\" selama " + duration + " hari.");
    }

    public void returnBook(String title) {
        System.out.println(name + " mengembalikan buku berjudul: " + title);
    }
}