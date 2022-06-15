package factory;

import factory.domain.Ship;
import factory.domain.TransportType;
import factory.domain.Truck;

import static factory.domain.TransportType.TRUCK;

public class TransportFactory {

    private TransportFactory(){
    }

    public static Transport getTransport(TransportType transportType) {
        if (TRUCK.equals(transportType)) {
            return new Truck();
        }
        return new Ship();
    }
}
