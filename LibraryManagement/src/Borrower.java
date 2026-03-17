import java.util.*;

public class Borrower extends User {
    List<Book> borrowed = new ArrayList<>();
    int deposit = 1500;

    public Borrower(String email, String password) {
        super(email, password);
    }

    public void viewBooks(List<Book> books) {
        for (Book b : books) {
            b.display();
        }
    }

    public void borrowBook(List<Book> books, Scanner sc) {
        if (borrowed.size() >= 3) {
            System.out.println("Max 3 books allowed!");
            return;
        }

        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();

        for (Book b : books) {
            if (b.isbn.equals(isbn) && b.quantity > 0) {
                borrowed.add(b);
                b.quantity--;
                System.out.println("Book Borrowed!");
                return;
            }
        }

        System.out.println("Book not available!");
    }
}