package builder.gof;

import builder.gof.domain.OrderSummary;
import builder.gof.domain.Pizza;
import org.junit.jupiter.api.Test;

import static builder.gof.domain.PizzaType.PANEER_MAKHANI;
import static builder.gof.domain.PizzaType.VEG_EXTRAVAGANZA;
import static builder.gof.domain.Topping.CHEESE;
import static builder.gof.domain.Topping.JALAPENO;
import static builder.gof.domain.Topping.MUSHROOM;
import static builder.gof.domain.Topping.ONION;
import static builder.gof.domain.Topping.PANEER;
import static builder.gof.domain.Topping.TOMATO;
import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BuilderPatternTest {

    @Test
    void testCreationOfPaneerMakhaniPizza() {
        var pizzaBuilder = new PizzaBuilder();
        var director = new Director();
        director.buildSmallPaneerMakhani(pizzaBuilder);
        var expectedPizza = new Pizza(PANEER_MAKHANI, of(CHEESE, PANEER, JALAPENO), 330, 6, 1);

        var pizza = pizzaBuilder.getPizza();

        assertEquals(PANEER_MAKHANI, pizza.getName());
        assertEquals(of(CHEESE, PANEER, JALAPENO), pizza.getToppings());
        assertEquals(6, pizza.getSize());
        assertEquals(330, pizza.getPrice());
        assertEquals(1, pizza.getQuantity());
        assertEquals(expectedPizza, pizza);
    }

    @Test
    void testCreationOfVegExtravanzaPizzaOrderSummary() {
        var summaryBuilder = new OrderSummaryBuilder();
        var director = new Director();
        director.buildSmallVegExtravaganza(summaryBuilder);
        var expectedPizzaSummary = new OrderSummary(VEG_EXTRAVAGANZA, of(CHEESE, PANEER, MUSHROOM, ONION, TOMATO, JALAPENO),
            320, 6, 1);

        var pizzaSummary = summaryBuilder.getOrderSummary();

        assertEquals(expectedPizzaSummary.summary(), pizzaSummary.summary());
    }
}
