import java.util.*;

public class Library {
    List<Book> books = new ArrayList<>();
    List<Admin> admins = new ArrayList<>();
    List<Borrower> borrowers = new ArrayList<>();

    public User login(String email, String password) {
        for (Admin a : admins) {
            if (a.email.equals(email) && a.password.equals(password)) {
                return a;
            }
        }

        for (Borrower b : borrowers) {
            if (b.email.equals(email) && b.password.equals(password)) {
                return b;
            }
        }

        return null;
    }
}