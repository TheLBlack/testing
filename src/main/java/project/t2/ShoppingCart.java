package project.t2;

import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public void addProduct(Product product) {
        if (product == null) throw new IllegalArgumentException();
        this.products.add(product);
    }

    public void removeLastProduct() {

    }

    public List<Product> getProductsInCart() {
        return this.products;
    }

    public double checkOut() {
        return -1d;
    }
}
