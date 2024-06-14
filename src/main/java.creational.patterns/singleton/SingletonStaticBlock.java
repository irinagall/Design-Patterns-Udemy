package singleton;

public class SingletonStaticBlock {
    private static SingletonStaticBlock singletonStaticBlockInstance;

    static{
        singletonStaticBlockInstance = new SingletonStaticBlock();
    }

    private SingletonStaticBlock(){};

    public static SingletonStaticBlock getInstance(){
        return singletonStaticBlockInstance;
    };
}
