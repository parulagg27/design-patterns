package singleton;

public class EagerInitialisedSingleton {

    private EagerInitialisedSingleton() {
    }

    private static final EagerInitialisedSingleton INSTANCE = new EagerInitialisedSingleton();

    public static EagerInitialisedSingleton getInstance(){
        return INSTANCE;
    }
}
