package project.t2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ShoppingCart {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        if (product == null) throw new IllegalArgumentException();
        this.products.add(product);
    }

    public void removeLastProduct() {
        this.products.remove(this.products.size()-1);
    }

    public List<Product> getProductsInCart() {
        return List.copyOf(this.products);
    }

    public double checkOut2() {
        double sum = 0;
        for (Product product : this.products) {
            sum += product.getPrice();
        }

        return sum;
    }

    public double checkOut() {
        return this.products.stream().mapToDouble(Product::getPrice).sum();
    }
}
