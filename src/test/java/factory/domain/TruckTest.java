package factory.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruckTest {

    @Test
    void shouldBeAbleToGetActualStatusOfCargoDeliveryViaTruck() {
        var truck = new Truck();
        var expectedStatus = "Loaded cargo on truck.\n";
        truck.loadCargo();

        assertEquals(expectedStatus, truck.getCargoStatus());
    }
}
