package project.t1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Calculator {

    public String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public int addition(int... numbers) {
        return IntStream.of(numbers).sum();
    }

    public int subtraction(int... numbers) {
        return IntStream.of(Arrays.copyOfRange(numbers, 1, numbers.length)).reduce(numbers[0], (a, b) -> a-b);
    }

    public int multiplication(int... numbers) {
        return IntStream.of(numbers).reduce(1, (a, b) -> a*b);
    }

    public double division(double... numbers) {
        if (DoubleStream.of(numbers).anyMatch(n -> n == 0)) throw new IllegalArgumentException();
        return DoubleStream.of(Arrays.copyOfRange(numbers, 1, numbers.length)).reduce(numbers[0], (a, b) -> a/b);
    }

    public double[] pow(double power, double... numbers) {
        return DoubleStream.of(numbers).map(n -> Math.pow(n, power)).toArray();
    }

    public Set<Double> sqrt(double... numbers) {
        return DoubleStream.of(numbers).map(Math::sqrt).boxed().collect(Collectors.toUnmodifiableSet());
    }

    public List<Double> roundDown(double... numbers) {
        return DoubleStream.of(numbers).map(Math::floor).boxed().toList();
    }

    public Map<Double, Double> roundUp(double... numbers) {
        return DoubleStream.of(numbers).boxed().collect(Collectors.toUnmodifiableMap(k -> k, Math::ceil));
    }
}
