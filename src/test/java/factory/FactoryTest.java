package factory;

import org.junit.jupiter.api.Test;

import static factory.domain.TransportType.SHIP;
import static factory.domain.TransportType.TRUCK;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryTest {

    @Test
    void shouldBeAbleToDeliverCargoViaTrack() {
        var transport = TransportFactory.getTransport(TRUCK);
        transport.loadCargo();
        transport.deliver();
        var expectedStatus = "Loaded cargo on truck.\n" + "Delivery initiated via truck.";

        assertEquals(expectedStatus, transport.getCargoStatus());
    }

    @Test
    void shouldBeAbleToDeliverCargoViaShip() {
        var transport = TransportFactory.getTransport(SHIP);
        transport.loadCargo();
        transport.deliver();
        var expectedStatus = "Loaded cargo on ship.\n" + "Delivery shipment initiated.";

        assertEquals(expectedStatus, transport.getCargoStatus());
    }
}
