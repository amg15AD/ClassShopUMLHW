package shop;

public class Shirt extends Clothing{
    private static int inventory;

    public Shirt(String name, Size size, double price, int inventory) {
        super(name, size, price, inventory);
    }
}
