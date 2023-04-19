package project.t3;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Map;

public class Receipt {

    private Instant created = Instant.now();
    private Map<String, Double> products;
    private double total;

    public Receipt(Map<String, Double> products, double total) {
        double rezult = 0d;
        for (Double cena : products.values()) {
            rezult += cena;
        }
        if (rezult != total) throw new IllegalArgumentException();

        this.products = products;
        this.total = total;
    }

    public Map<String, Double> getProducts() {
        return this.products;
    }

    public double inTotal() {
        return this.total;
    }

    public LocalDateTime getDate() {
        return LocalDateTime.ofInstant(this.created, ZoneId.systemDefault());
    }
}
