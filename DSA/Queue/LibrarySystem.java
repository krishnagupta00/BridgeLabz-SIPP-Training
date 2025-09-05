import java.util.*;

class Book {
    String isbn, title, author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return isbn + ": " + title + " by " + author;
    }
}

     public class LibrarySystem {
    public static void main(String[] args) {
        Map<String, Book> books = new HashMap<>();
        books.put("B1", new Book("B1", "Java", "Apna College"));
        books.put("B2", new Book("B2", "Python", "PW Skills"));
        books.put("B3", new Book("B3", "C++", "Kunal Kushwah"));

        System.out.println("Available Books:");
        for (Book book : books.values()) {
            System.out.println(" - " + book);
        }

        Set<String> issued = new HashSet<>();
        issued.add("B1");

        // Try to issue another book
        String toIssue = "B2";
        System.out.println("Trying to issue: " + toIssue);
        if (!books.containsKey(toIssue)) {
            System.out.println("Book not found.");
        } else if (issued.contains(toIssue)) {
            System.out.println("Already issued.");
        } else {
            issued.add(toIssue);
            System.out.println("Issued: " + toIssue);
        }

        // Try to return a book
        String toReturn = "B1";
        System.out.println("Trying to return: " + toReturn);
        if (issued.remove(toReturn)) {
            System.out.println("Returned: " + toReturn);
        } else {
            System.out.println("Was not issued.");
        }
    }
}
