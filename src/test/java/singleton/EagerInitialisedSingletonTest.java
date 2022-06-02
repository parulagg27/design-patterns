package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EagerInitialisedSingletonTest {

    @Test
    void shouldGetSameInstanceOfSingletonClassForMultipleCallsInSameThread() {
        var instance1 = EagerInitialisedSingleton.getInstance();
        var instance2 = EagerInitialisedSingleton.getInstance();

        assertEquals(instance1, instance2);
    }
}
