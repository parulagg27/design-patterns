package singleton;

public class StaticBlockInitialisedSingleton {

    private StaticBlockInitialisedSingleton() {
    }

    private static final StaticBlockInitialisedSingleton instance;

    static {
        try {
            instance = new StaticBlockInitialisedSingleton();
        } catch (Exception e){
            throw new RuntimeException("Exception while creating singleton instance", e);
        }
    }

    public static StaticBlockInitialisedSingleton getInstance(){
        return instance;
    }
}
