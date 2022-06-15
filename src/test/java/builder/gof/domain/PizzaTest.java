package builder.gof.domain;

import org.junit.jupiter.api.Test;

import static builder.gof.domain.PizzaType.PANEER_MAKHANI;
import static builder.gof.domain.Topping.CHEESE;
import static builder.gof.domain.Topping.JALAPENO;
import static builder.gof.domain.Topping.PANEER;
import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PizzaTest {

    @Test
    void shouldThrowErrorIfZeroPizzaQuantityGiven() {
        var errorMessage = assertThrows(RuntimeException.class,
            () -> new Pizza(PANEER_MAKHANI, of(CHEESE, PANEER, JALAPENO), 330, 6, 0)).getMessage();

        assertEquals("Atleast one pizza is required", errorMessage);
    }

    @Test
    void shouldThrowErrorIfNegativeInvalidPizzaQuantityGiven() {
        var errorMessage = assertThrows(RuntimeException.class,
            () -> new Pizza(PANEER_MAKHANI, of(CHEESE, PANEER, JALAPENO), 330, 6, -1)).getMessage();

        assertEquals("Atleast one pizza is required", errorMessage);
    }
}
