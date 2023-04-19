package project.t3;

import org.junit.jupiter.api.Test;
import project.t2.Bread;
import project.t2.Milk;
import project.t2.ShoppingCart;

import static org.assertj.core.api.Assertions.assertThat;

public class CashRegisterTest {

    @Test
    public void listIsWorking() {
        // given
        ShoppingCart cart = new ShoppingCart();
        CashRegister cash = new CashRegister();

        // when
        cash.addToCartsQueue(cart);

        // then
        assertThat(cash.carts).isNotEmpty();
    }

    @Test
    public void shouldReturnTotalPriceInReceipt() {
        //given
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Bread());
        cart.addProduct(new Milk());

        CashRegister cash = new CashRegister();
        cash.addToCartsQueue(cart);

        //when
        Receipt receipt = cash.serveCart();

        //then
        assertThat(receipt.getProducts().size()).isEqualTo(2);
        assertThat(receipt.getProducts()).containsOnlyKeys("chleb", "mleko");
        assertThat(receipt.inTotal()).isEqualTo(cart.checkOut());
    }

    @Test
    public void shouldReturnTotalEarnedMoney() {
        //given
        ShoppingCart cart1 = new ShoppingCart();
        cart1.addProduct(new Bread());
        cart1.addProduct(new Milk());

        ShoppingCart cart2 = new ShoppingCart();
        cart2.addProduct(new Bread());
        cart2.addProduct(new Milk());

        CashRegister cash = new CashRegister();

        // when
        cash.addToCartsQueue(cart1);
        cash.addToCartsQueue(cart2);
        cash.serveCart();
        cash.serveCart();

        double total = cash.getTotalEarned();

        // then
        assertThat(total).isEqualTo(17.96d);
    }
}
