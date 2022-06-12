package singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleCheckedLockingSingletonTest {

    @Test
    void shouldCheckForInstanceCreationInParallelThreads() {
        var myThreadPool = Executors.newFixedThreadPool(2);
        var task1 = CompletableFuture
            .supplyAsync(DoubleCheckedLockingSingleton::getInstance,myThreadPool);
        var task2 = CompletableFuture
            .supplyAsync(DoubleCheckedLockingSingleton::getInstance,myThreadPool);
        var instance1 = task1.join();
        var instance2 = task2.join();

        assertEquals(instance1, instance2);
    }
}
