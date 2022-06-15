package builder.gof;

import builder.gof.domain.PizzaType;
import builder.gof.domain.Topping;

import java.util.List;

public interface PizzaBuilderInterface {

    void setName(PizzaType name);

    void setToppings(List<Topping> topping);

    void setPrice(Integer price);

    void setSize(Integer size);

    void setQuantity(Integer quantity);
}
