package project.t2;

public class Bread implements Product {


    @Override
    public String getName() {
        return "chleb";
    }

    @Override
    public double getPrice() {
        return 2.99d;
    }
}
