package builder.gof.domain;

import java.util.List;

public class OrderSummary {

    private PizzaType name;
    private List<Topping> toppings;
    private Integer price;
    private Integer size;
    private Integer quantity;

    public OrderSummary(PizzaType name, List<Topping> toppings, Integer price, Integer size, Integer quantity) {
        this.name = name;
        this.toppings = toppings;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
    }

    public String summary() {
        var billDetails = "";
        billDetails += "Pizza: " + name + "\n";
        billDetails += "Toppings added: " + toppings + "\n";
        billDetails += "Price: " + price + "\n";
        billDetails += "Size: " + size + "\n";
        billDetails += "Quantity: " + quantity + "\n";
        billDetails += "Total Amount: " + quantity * price + "\n";
        return billDetails;
    }
}
