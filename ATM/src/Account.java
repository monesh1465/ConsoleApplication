public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Invalid amount!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        }
    }
}