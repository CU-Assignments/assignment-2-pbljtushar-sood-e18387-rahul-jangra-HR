// Product class with id, name, and price attributes
class Product {
    // Attributes of the Product class
    private int id;
    private String name;
    private double price;

    // Constructor to initialize product details
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter methods to access private variables (optional, if needed)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("\nProduct Details:");
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: $" + price);
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        // Creating product objects using the constructor
        Product product1 = new Product(101, "Laptop", 799.99);
        Product product2 = new Product(102, "Smartphone", 499.99);

        // Displaying product details
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
