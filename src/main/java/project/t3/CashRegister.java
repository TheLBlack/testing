package project.t3;

import project.t2.ShoppingCart;

import java.util.LinkedList;
import java.util.List;

public class CashRegister {

    private double totalEarned;
    private List<ShoppingCart> carts = new LinkedList<>();

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

            return null; // return Receipt
        }

        return null;
    }
}
