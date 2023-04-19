package project.t4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import project.t2.Bread;
import project.t2.Milk;
import project.t2.Product;
import project.t2.ShoppingCart;
import project.t3.CashRegister;
import project.t3.Receipt;

import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class IntegrationShoppingTest {
    @ParameterizedTest
    @MethodSource
    public void shouldBeAbleToAddProductsToCartAndGetReceiptByCashRegister(List<Product> products, Map<String, Double> expected, double total) {
        // given
        ShoppingCart cart = new ShoppingCart();
        //for (Product product : products) cart.addProduct(product); ta linijka znaczy to samo co ta poniżej
        products.forEach(cart::addProduct);

        CashRegister cash = new CashRegister();
        cash.addToCartsQueue(cart);

        // when
        Receipt receipt = cash.serveCart();

        // then
        assertThat(receipt.getProducts()).containsAllEntriesOf(expected);
        assertThat(receipt.inTotal()).isEqualTo(total);
    }

    public static Stream<Arguments> shouldBeAbleToAddProductsToCartAndGetReceiptByCashRegister() {
        return Stream.of(
                Arguments.of(
                        List.of(new Milk()), Map.of("mleko", 5.99d), 5.99d
                ),
                Arguments.of(
                        List.of(new Milk(), new Bread()), Map.of("mleko", 5.99d, "chleb", 2.99d), 8.98d
                )
        );
    }
}
