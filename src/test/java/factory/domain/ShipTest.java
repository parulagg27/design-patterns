package factory.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShipTest {

    @Test
    void shouldBeAbleToGetActualStatusOfCargoDeliveryViaShip() {
        var ship = new Ship();
        var expectedStatus = "Loaded cargo on ship.\n";
        ship.loadCargo();

        assertEquals(expectedStatus, ship.getCargoStatus());
    }
}
