package project.t3;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Map;

public class Receipt {

    private Instant created = Instant.now();
    private Map<String, Double> products;
    private double total;

    public Receipt(Map<String, Double> products, double total) {
        this.products = products;
    }

    public Map<String, Double> getProducts() {
        return this.products;
    }

    public double inTotal() {
        return this.total;
    }

    public LocalDateTime getDate() {
        return null;
    }
}
