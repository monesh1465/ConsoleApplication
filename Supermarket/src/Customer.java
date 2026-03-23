import java.util.*;

public class Customer extends User {
    double credit = 1000;
    int points = 0;
    List<Product> cart = new ArrayList<>();

    public Customer(String email, String password) {
        super(email, password);
    }

    public void viewProducts(List<Product> products) {
        for (Product p : products) {
            p.display();
        }
    }

    public void addToCart(List<Product> products, Scanner sc) {
        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        for (Product p : products) {
            if (p.id == id && p.quantity > 0) {
                cart.add(p);
                System.out.println("Added to cart!");
                return;
            }
        }
        System.out.println("Product not available!");
    }

    public void checkout() {
        double total = 0;

        for (Product p : cart) {
            total += p.price;
        }

        if (total > credit) {
            System.out.println("Not enough credit!");
            return;
        }

        credit -= total;

        // reward
        if (total >= 5000) {
            credit += 100;
            System.out.println("₹100 cashback added!");
        } else {
            points += (int)(total / 100);
        }

        cart.clear();

        System.out.println("Payment successful! Remaining credit: ₹" + credit);
    }
}