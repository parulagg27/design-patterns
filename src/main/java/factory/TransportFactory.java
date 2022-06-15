package factory;

import static factory.TransportType.TRUCK;

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
