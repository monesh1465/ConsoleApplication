import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        // Default users
        lib.admins.add(new Admin("admin@gmail.com", "123"));
        lib.borrowers.add(new Borrower("user@gmail.com", "123"));

        while (true) {
            System.out.println("\n1. Login\n2. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Password: ");
                String pass = sc.nextLine();

                User user = lib.login(email, pass);

                if (user == null) {
                    System.out.println("Invalid Login!");
                }

                else if (user instanceof Admin) {
                    Admin admin = (Admin) user;

                    while (true) {
                        System.out.println("\n--- Admin Menu ---");
                        System.out.println("1. Add Book");
                        System.out.println("2. View Books");
                        System.out.println("3. Logout");

                        int ch = sc.nextInt();
                        sc.nextLine();

                        if (ch == 1) admin.addBook(lib.books, sc);
                        else if (ch == 2) admin.viewBooks(lib.books);
                        else break;
                    }
                }

                else if (user instanceof Borrower) {
                    Borrower bor = (Borrower) user;

                    while (true) {
                        System.out.println("\n--- Borrower Menu ---");
                        System.out.println("1. View Books");
                        System.out.println("2. Borrow Book");
                        System.out.println("3. Logout");

                        int ch = sc.nextInt();
                        sc.nextLine();

                        if (ch == 1) bor.viewBooks(lib.books);
                        else if (ch == 2) bor.borrowBook(lib.books, sc);
                        else break;
                    }
                }
            } else {
                break;
            }
        }
    }
}