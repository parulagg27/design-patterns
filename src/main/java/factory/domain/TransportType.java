package factory.domain;

import factory.Transport;

import java.util.function.Supplier;

public enum TransportType {
    TRUCK(Truck::new),
    SHIP(Ship::new);

    public final Supplier<Transport> transportConstructor;

    TransportType(Supplier<Transport> transportConstructor) {
        this.transportConstructor = transportConstructor;
    }
}
