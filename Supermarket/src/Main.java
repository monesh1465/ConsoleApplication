import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Store store = new Store();

        // default users
        store.admins.add(new Admin("admin@gmail.com", "123"));
        store.customers.add(new Customer("user@gmail.com", "123"));

        while (true) {
            System.out.println("\n1. Login\n2. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Password: ");
                String pass = sc.nextLine();

                User user = store.login(email, pass);

                if (user == null) {
                    System.out.println("Invalid!");
                }

                else if (user instanceof Admin) {
                    Admin a = (Admin) user;

                    while (true) {
                        System.out.println("\n--- Admin ---");
                        System.out.println("1. Add Product");
                        System.out.println("2. View Products");
                        System.out.println("3. Logout");

                        int c = sc.nextInt();

                        if (c == 1) a.addProduct(store.products, sc);
                        else if (c == 2) a.viewProducts(store.products);
                        else break;
                    }
                }

                else if (user instanceof Customer) {
                    Customer c = (Customer) user;

                    while (true) {
                        System.out.println("\n--- Customer ---");
                        System.out.println("1. View Products");
                        System.out.println("2. Add to Cart");
                        System.out.println("3. Checkout");
                        System.out.println("4. Logout");

                        int cc = sc.nextInt();

                        if (cc == 1) c.viewProducts(store.products);
                        else if (cc == 2) c.addToCart(store.products, sc);
                        else if (cc == 3) c.checkout();
                        else break;
                    }
                }
            } else break;
        }
    }
}