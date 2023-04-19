package project.t2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ShoppingCartTest {

    @Test // this test should be successful
    public void shouldReturnImmutableList() {
        // given
        ShoppingCart cart = new ShoppingCart();

        // when
        List<Product> products = cart.getProductsInCart();

        // when then
        assertThat(products).isUnmodifiable();
    }

    @Test
    public void shouldAddProductToShoppingCart() {
        // given
        ShoppingCart cart = new ShoppingCart();
        Milk product = new Milk();

        // when
        cart.addProduct(product);

        // then
        assertThat(cart.getProductsInCart()).containsExactly(product);
    }

    @Test
    public void shouldThrowExceptionOnNullValue() {
        // given
        ShoppingCart cart = new ShoppingCart();

        // when then
        assertThrows(IllegalArgumentException.class, () -> cart.addProduct(null));
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> cart.addProduct(null));
    }

    @Test
    public void shouldRemoveLastProduct() {
        // given
        ShoppingCart cart = new ShoppingCart();
        Milk product1 = new Milk(), product2 = new Milk(), product3 = new Milk();

        // when
        cart.addProduct(product3);
        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.removeLastProduct();

        // then
        assertThat(cart.getProductsInCart()).containsExactly(product3, product1);
    }

    @Test
    public void shouldReturnValueOfShoppingCart() {
        // given
        ShoppingCart cart = new ShoppingCart();
        Milk product1 = new Milk(), product2 = new Milk();

        // when
        cart.addProduct(product1);
        cart.addProduct(product2);

        double value = cart.checkOut();

        // then
        assertThat(value).isEqualTo(11.98d);
    }
}
