package factory.domain;

import factory.Transport;

import java.util.ArrayList;
import java.util.List;

public class Truck implements Transport {

    private final List<String> cargoStatus = new ArrayList<>();

    @Override
    public void loadCargo() {
        cargoStatus.add("Loaded cargo on truck.\n");
    }

    @Override
    public void deliver() {
        cargoStatus.add("Delivery initiated via truck.");
    }

    @Override
    public String getCargoStatus() {
        return String.join("", cargoStatus);
    }
}
