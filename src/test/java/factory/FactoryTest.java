package factory;

import org.junit.jupiter.api.Test;

import static factory.TransportType.SHIP;
import static factory.TransportType.TRUCK;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactoryTest {

    @Test
    void shouldBeAbleToDeliverCargoViaTrack() {
        var transport = TransportFactory.getTransport(TRUCK);
        var expectedStatus = "Loaded cargo on truck.\n" + "Delivery initiated via truck.";
        transport.loadCargo();

        transport.deliver();

        assertEquals(expectedStatus, transport.getCargoStatus());
    }

    @Test
    void shouldBeAbleToDeliverCargoViaShip() {
        var transport = TransportFactory.getTransport(SHIP);
        var expectedStatus = "Loaded cargo on ship.\n" + "Delivery shipment initiated.";
        transport.loadCargo();

        transport.deliver();

        assertEquals(expectedStatus, transport.getCargoStatus());
    }

    @Test
    void shouldBeAbleToTrackActualStatusOfCargoDeliveryViaShip() {
        var transport = TransportFactory.getTransport(SHIP);
        var expectedStatus = "Loaded cargo on ship.\n";
        transport.loadCargo();

        assertEquals(expectedStatus, transport.getCargoStatus());
    }
}
