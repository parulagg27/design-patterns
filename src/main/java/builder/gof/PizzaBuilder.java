package builder.gof;

import builder.gof.domain.Pizza;
import builder.gof.domain.PizzaType;
import builder.gof.domain.Topping;

import java.util.List;

public class PizzaBuilder implements PizzaBuilderInterface {

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
    public void setToppings(List<Topping> topping) {
        this.toppings = topping;
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

    public Pizza getPizza() {
        return new Pizza(name, toppings, price, size, quantity);
    }
}
