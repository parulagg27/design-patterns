package factory.domain;

import factory.Transport;

import java.util.ArrayList;
import java.util.List;

public class Ship implements Transport {

    private final List<String> cargoStatus = new ArrayList<>();

    @Override
    public void loadCargo() {
        cargoStatus.add("Loaded cargo on ship.\n");
    }

    @Override
    public void deliver() {
        cargoStatus.add("Delivery shipment initiated.");
    }

    @Override
    public String getCargoStatus() {
        return String.join("", cargoStatus);
    }
}
