package factory;

import factory.domain.TransportType;

public class TransportFactory {

    private TransportFactory(){
    }

    public static Transport getTransport(TransportType transportType) {
        return transportType.transportConstructor.get();
    }
}
