package shop;

public class User {
    private int id;
    public static int uniqueId = 0;
    private Cart cart;
    public User(Cart cart){
        this.cart =  cart;
        uniqueId++;
        id = uniqueId;
    }

    public void addToCart(Product product, int qty){
        if(product.getInventory() == 0){
            System.out.println("Sorry we're out of stock");
        }
        else if(qty <= product.getInventory()){
            cart.getProducts().add(product);
            product.setInventory(product.getInventory()-qty);
            product.setQuantity(qty);
            System.out.println(product.getName()+ " added to cart!!");
        }
        else if(qty > product.getInventory()){
            System.out.println("Thats too much, we have "+ product.getInventory()+ " in stock.");
        }

    }
    public void removeFromCart(Product product, int qty){
        if(product.getQuantity() == 0){
            System.out.println("You're not returning anything buddy");
        }
        else if(product.getQuantity() <= qty){
            cart.getProducts().remove(product);
            product.setInventory(product.getInventory()+qty);
            product.setQuantity(qty);
            System.out.println(qty+ product.getName()+" removed from cart");
        }
        else if (product.getQuantity() > product.getInventory()){
            System.out.println("We never had that much");
        }
    }

}
