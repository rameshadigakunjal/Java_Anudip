package MyWork;
class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String productName, double startingPrice) {
        this.id = id;
        this.name = productName;
        this.price = startingPrice;

        System.out.println("Product Created: ID=" + id + ", Name=" + name + ", Price=" + price);
    }
    public int getProductId() {
        return id;
    }
    public String getProductName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
public class InventoryApp {
    public static void main(String[] args) {
        Product laptop = new Product(101, "gaming laptop", 1500.00);
        Product smartphone = new Product(102, "smartphone", 800.00);

        System.out.println(laptop.getProductName() + " costs $" + laptop.getPrice());
        System.out.println(smartphone.getProductName() + " costs $" + smartphone.getPrice());
        
    }
}
