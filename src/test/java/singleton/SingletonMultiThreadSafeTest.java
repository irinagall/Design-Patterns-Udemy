package singleton;

import static org.junit.jupiter.api.Assertions.*;

class SingletonMultiThreadSafeTest {
    public static void main(String[] args) {
        SingletonMultiThreadSafe singletonMultiThreadSafeInstance1 = SingletonMultiThreadSafe.getInstance();
        SingletonMultiThreadSafe singletonMultiThreadSafeInstance2 = SingletonMultiThreadSafe.getInstance();

        System.out.println(singletonMultiThreadSafeInstance1);
        System.out.println(singletonMultiThreadSafeInstance2);
    }

}