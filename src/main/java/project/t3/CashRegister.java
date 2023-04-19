package project.t3;

import project.t2.Product;
import project.t2.ShoppingCart;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CashRegister {

    private double totalEarned = 0;
    protected List<ShoppingCart> carts = new LinkedList<>();

    public void addToCartsQueue(ShoppingCart cart) {
        this.carts.add(cart);
    }

    public double getTotalEarned() {
        return this.totalEarned;
    }

    public Receipt serveCart() {
        if (!this.carts.isEmpty()) {
            ShoppingCart next = this.carts.remove(0);
            double price = next.checkOut();

            this.totalEarned += price;

            Map<String, Double> products = new HashMap<>();
            for (Product product : next.getProductsInCart()) {
                products.put(product.getName(), product.getPrice());
            }

            return new Receipt(products, price);
        }

        return null;
    }
}
