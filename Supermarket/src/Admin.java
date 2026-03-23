import java.util.*;

public class Admin extends User {

    public Admin(String email, String password) {
        super(email, password);
    }

    public void addProduct(List<Product> products, Scanner sc) {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity: ");
        int qty = sc.nextInt();

        products.add(new Product(id, name, price, qty));
        System.out.println("Product Added!");
    }

    public void viewProducts(List<Product> products) {
        for (Product p : products) {
            p.display();
        }
    }
}