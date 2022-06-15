package builder.gof;

import builder.gof.domain.OrderSummary;
import builder.gof.domain.PizzaType;
import builder.gof.domain.Topping;

import java.util.List;

public class OrderSummaryBuilder implements PizzaBuilderInterface {

    private PizzaType name;
    private List<Topping> toppings;
    private Integer price;
    private Integer size;
    private Integer quantity;

    @Override
    public void setName(PizzaType name) {
        this.name = name;
    }

    @Override
    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public OrderSummary getOrderSummary() {
        return new OrderSummary(name, toppings, price, size, quantity);
    }
}
