package project.t2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ShoppingCartTest {

    @Test // this test should be successful
    public void shouldReturnImmutableList() {
        // given
        ShoppingCart cart = new ShoppingCart();

        // when then
        assertThatExceptionOfType(UnsupportedOperationException.class).isThrownBy(() -> cart.getProductsInCart().remove(0));
    }
}
