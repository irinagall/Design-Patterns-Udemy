package prototype;

import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        Vehicle car1 = new Car(4,3000, "red");
        Vehicle car2 = car1.clone();

        car2.isClone(car1);
        car1.isClone(car2);

        Vehicle bicycle1 = new Bicyle(2,300, true);
        Vehicle bicycle2 = bicycle1.clone();

        bicycle2.isClone(bicycle1);
        bicycle1.isClone(bicycle2);

        bicycle1.isClone(car1);
    }
}
