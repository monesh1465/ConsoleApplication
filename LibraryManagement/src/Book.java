public class Book {
    String name;
    String isbn;
    int quantity;

    public Book(String name, String isbn, int quantity) {
        this.name = name;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public void display() {
        System.out.println(name + " | ISBN: " + isbn + " | Qty: " + quantity);
    }
}