package singleton;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EagerInitialisedSingletonTest {

    @Test
    void shouldGetSameInstanceOfSingletonClassForMultipleCallsInSameThread() {
        var instance1 = EagerInitialisedSingleton.getInstance();
        var instance2 = EagerInitialisedSingleton.getInstance();

        assertEquals(instance1, instance2);
    }

    @Test
    void shouldTestForThreadSafetyOfEagerInstantiationInMultiThreadedEnv() throws ExecutionException, InterruptedException {
        var threadPool = Executors.newFixedThreadPool(10);
        var instance = EagerInitialisedSingleton.getInstance();
        var thread1 = threadPool.submit(EagerInitialisedSingleton::getInstance);
        var thread2 = threadPool.submit(EagerInitialisedSingleton::getInstance);

        assertEquals(instance, thread1.get());
        assertEquals(instance, thread2.get());
        assertEquals(thread1.get(), thread2.get());
    }
}
