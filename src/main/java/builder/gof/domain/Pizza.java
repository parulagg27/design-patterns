package builder.gof.domain;

import java.util.List;
import java.util.Objects;

public class Pizza {

    private PizzaType name;
    private List<Topping> toppings;
    private Integer price;
    private Integer size;
    private Integer quantity;

    public Pizza(PizzaType name, List<Topping> toppings, Integer price, Integer size, Integer quantity) {
        if (isInValidQuantity(quantity)){
            throw new RuntimeException("Atleast one pizza is required");
        }
        this.name = name;
        this.toppings = toppings;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
    }

    public PizzaType getName() {
        return name;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public boolean isInValidQuantity(Integer quantity) {
        return quantity <= 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pizza)) return false;
        Pizza pizza = (Pizza) o;
        return name == pizza.name && Objects.equals(toppings, pizza.toppings) && Objects.equals(price, pizza.price)
            && Objects.equals(size, pizza.size) && Objects.equals(quantity, pizza.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, toppings, price, size, quantity);
    }
}
