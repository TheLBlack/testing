package project.t1;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Map;
import java.util.Set;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void shouldThrowException() {
        // given
        double[] numbers = {2d, 4.1d, 0, 1d};

        // when then
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> this.calculator.division(numbers));
    }

    @ParameterizedTest
    @ValueSource(strings = {"elo", "dwadwa", "zero"})
    public void shouldReverseString(String input) {
        //when
        String reversed = calculator.reverse(input);

        //then
        assertThat(reversed).isEqualTo(new StringBuilder(input).reverse().toString());
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 5})
    public void shouldAdditionNumbers(int number) {
        // given
        int[] numbers = {5, number};

        // when
        int result = this.calculator.addition(numbers);

        // then
        assertThat(result).isEqualTo(5+number);
    }

    @Test
    public void shouldSubtractNumbers() {
        // given
        int[] numbers = {5, 3, 1};

        // when
        int result = this.calculator.subtraction(numbers);

        // then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldPowNumbers() {
        // given
        double power = 2d;
        double[] numbers = {2d, 3d};

        // when
        double[] result = this.calculator.pow(power, numbers);

        // then
        assertThat(result).contains(4d, 9d);
    }

    @Test
    public void shouldSqrtNumbers() {
        // given
        double[] numbers = {4d, 16d};

        // when
        Set<Double> result = this.calculator.sqrt(numbers);

        // then
        assertThat(result).containsExactlyInAnyOrder(4d, 2d);
    }

    @Test
    public void shouldRoundUpNumbers() {
        // given
        double[] numbers = {99.12d, -12.05d};

        // when
        Map<Double, Double> result = this.calculator.roundUp(numbers);

        // then
        assertThat(result).containsEntry(99.12d, 100d).containsEntry(-12.05d, -12d);
    }
}
