package singleton;

import static org.junit.jupiter.api.Assertions.*;

class SingletonEagerTests {
    public static void main(String[] args) {
        SingletonEager eagerInstance1 = SingletonEager.getEagerInstance();
        SingletonEager eagerInstance2 = SingletonEager.getEagerInstance();

        System.out.println(eagerInstance1);
        System.out.println(eagerInstance2);
    }

}