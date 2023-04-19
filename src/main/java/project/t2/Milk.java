package project.t2;

public class Milk implements Product {
    @Override
    public String getName() {
        return "mleko";
    }

    @Override
    public double getPrice() {
        return 5.99d;
    }
}
