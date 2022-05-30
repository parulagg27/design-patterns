package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EagerInitialisedSingletonTest {

    @Test
    void shouldGetSameInstanceOfSingletonClassForMultipleCallsInSameThread() {
        var instance1 = StaticBlockInitialisedSingleton.getInstance();
        var instance2 = StaticBlockInitialisedSingleton.getInstance();

        assertEquals(instance1, instance2);
    }
}
