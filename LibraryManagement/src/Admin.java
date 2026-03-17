import java.util.*;

public class Admin extends User {

    public Admin(String email, String password) {
        super(email, password);
    }

    public void addBook(List<Book> books, Scanner sc) {
        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();
        System.out.print("Enter ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        sc.nextLine();

        books.add(new Book(name, isbn, qty));
        System.out.println("Book Added!");
    }

    public void viewBooks(List<Book> books) {
        for (Book b : books) {
            b.display();
        }
    }
}