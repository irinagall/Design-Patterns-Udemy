package singleton;

public class SingletonMultiThreadSafe {

    private static SingletonMultiThreadSafe singletonMultiThreadSafeInstance;

    private SingletonMultiThreadSafe(){};

    public static SingletonMultiThreadSafe getInstance(){
        synchronized (SingletonMultiThreadSafe.class){
            if(singletonMultiThreadSafeInstance == null){
                singletonMultiThreadSafeInstance = new SingletonMultiThreadSafe();
            }
        }
        return singletonMultiThreadSafeInstance;
    }
}
