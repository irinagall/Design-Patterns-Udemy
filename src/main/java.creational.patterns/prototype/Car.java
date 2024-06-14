package prototype;

public class Car extends Vehicle{
    private String color;

    public Car(int wheels, long price, String color) {
        this.wheels = wheels;
        this.price = price;
        this.color = color;
    }

    public Car(Car target) {
        super(target);
        if (target != null){
        color = target.color;
        }
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if (target instanceof Car){
            Car targ = (Car) target;
            if (color.equals(targ.color) && wheels == targ.wheels && price == targ.price){
                System.out.println( this + " " + targ + " are clones");
                return true;
            }
        }
        System.out.println( this + " " + target + " are not clones");
        return false;
    }
}
