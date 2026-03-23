import java.util.*;

public class Store {
    List<Product> products = new ArrayList<>();
    List<Admin> admins = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

    public User login(String email, String pass) {
        for (Admin a : admins) {
            if (a.email.equals(email) && a.password.equals(pass)) return a;
        }
        for (Customer c : customers) {
            if (c.email.equals(email) && c.password.equals(pass)) return c;
        }
        return null;
    }
}