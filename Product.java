package shop;

public abstract class Product {

    private int id;
    public static int uniqueId = 0;
    private String name;
    private Size size;
    private double price;
    private int inventory;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(String name, Size size, double price, int inventory) {
        this.name = name;
        this.size = size;
        this.price = price;
        this.inventory = inventory;
        uniqueId++;
        id = uniqueId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }





}
