package builder.gof;

import static builder.gof.domain.PizzaType.PANEER_MAKHANI;
import static builder.gof.domain.PizzaType.VEG_EXTRAVAGANZA;
import static builder.gof.domain.Topping.CHEESE;
import static builder.gof.domain.Topping.JALAPENO;
import static builder.gof.domain.Topping.MUSHROOM;
import static builder.gof.domain.Topping.ONION;
import static builder.gof.domain.Topping.PANEER;
import static builder.gof.domain.Topping.TOMATO;
import static java.util.List.of;

public class Director {

    public void buildSmallVegExtravaganza(PizzaBuilderInterface builder) {
        builder.setName(VEG_EXTRAVAGANZA);
        builder.setToppings(of(CHEESE, PANEER, MUSHROOM, ONION, TOMATO, JALAPENO));
        builder.setSize(6);
        builder.setPrice(320);
        builder.setQuantity(1);
    }

    public void buildSmallPaneerMakhani(PizzaBuilderInterface builder) {
        builder.setName(PANEER_MAKHANI);
        builder.setToppings(of(CHEESE, PANEER, JALAPENO));
        builder.setSize(6);
        builder.setPrice(330);
        builder.setQuantity(1);
    }
}
