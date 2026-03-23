import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account(1000); // initial balance

        int pin = 1234;
        int enteredPin;

        System.out.print("Enter PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Wrong PIN!");
            return;
        }

        while (true) {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acc.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 3:
                    System.out.print("Enter amount: ");
                    double wit = sc.nextDouble();
                    acc.withdraw(wit);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}