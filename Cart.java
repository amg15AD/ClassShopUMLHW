package shop;

import java.util.ArrayList;


public class Cart {
    private ArrayList<Product> products;
    private final float TAX = 0.10f;
    private Special special;

    public Cart(ArrayList<Product> products) {
        this.products = products;
    }



    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;

    }

    public int cartQty(){
        int count = 0;
        for (Product p: products){
            count += p.getQuantity();
        }
        return count;
    }
    public double subTotal(){

        double total = 0;
        for (Product p: products){
            total =  p.getQuantity() * p.getPrice();
        }
        return total;
    }
    public double totalAfterTax(){
        double taxTotal = subTotal() + (subTotal() * TAX);
        return taxTotal;
    }
    public void checkout(){
        System.out.printf("\t\t======Receipt======\nQuantity\tSubtotal\tTotal after tax\n" +
                "%4d\t\t  $%.2f\t\t\t$%.2f\n",cartQty(),subTotal(),totalAfterTax());

    }


}
