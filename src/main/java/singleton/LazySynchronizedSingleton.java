package singleton;


import static java.util.Objects.isNull;

public class LazySynchronizedSingleton {

    private LazySynchronizedSingleton() {
    }

    private static LazySynchronizedSingleton instance;

    public static synchronized LazySynchronizedSingleton getInstance(){
        if (isNull(instance)){
            instance = new LazySynchronizedSingleton();
        }
        return instance;
    }
}
