package shop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Fries fries = new Fries("Curly fries",Size.L,4.99,10);
    Soda soda = new Soda("Pineapple fanta",Size.M,3.99,10);
    Shirt shirt = new Shirt("Ralph Lauren",Size.L,29.99,10);
    Sweater sweater = new Sweater("Nike",Size.M,25.00,10);
    Hat hat = new Hat("New Era",Size.S,14.99,10);

    Cart cart = new Cart(new ArrayList<>());
    User user1 = new User(cart);

    user1.addToCart(fries,2);
    System.out.println(fries.getInventory());
        System.out.println(fries.getQuantity());
        cart.checkout();






    }







}
