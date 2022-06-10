package singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LazySynchronizedSingletonTest {

    @Test
    void shouldReturnSameSingletonInstanceForMultipleCallsInSameThread() {
        var instance1 = LazySynchronizedSingleton.getInstance();
        var instance2 = LazySynchronizedSingleton.getInstance();
        var instance3 = LazySynchronizedSingleton.getInstance();

        assertEquals(instance1, instance2);
        assertEquals(instance1, instance3);
        assertEquals(instance2, instance3);
    }
}
