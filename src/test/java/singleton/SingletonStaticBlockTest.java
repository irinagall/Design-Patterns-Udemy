package singleton;


import static org.junit.jupiter.api.Assertions.*;

class SingletonStaticBlockTest {

    public static void main(String[] args) {


        SingletonStaticBlock singletonStaticBlockInstance1 = SingletonStaticBlock.getInstance();
        SingletonStaticBlock singletonStaticBlockInstance2 = SingletonStaticBlock.getInstance();

        System.out.println(singletonStaticBlockInstance1);
        System.out.println(singletonStaticBlockInstance2);

    }

}