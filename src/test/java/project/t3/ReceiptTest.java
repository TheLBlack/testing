package project.t3;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class ReceiptTest {

    @Test // this test should be successful
    public void shouldThrowExceptionWhenPricesDontMatch() {
        // given
        Map<String, Double> products = Map.of("prod1", 12d, "prod2", 2d);
        double total = 4d;

        // when then
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new Receipt(products, total));
    }
}
