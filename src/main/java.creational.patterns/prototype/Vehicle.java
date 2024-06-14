package prototype;

//Lets me copy existing object
// I just want to copy the object without wanting the particular peculiarities of that object
//only reliant on an interface
//the copied object must provide the copy functionality
// used in testing and pre-production

public abstract class Vehicle {
    public int wheels;
    public long price;

    public Vehicle(){}

    public Vehicle(Vehicle target){
        if (target != null){
        this.wheels = target.wheels;
        this.price = target.price;
        }
    }

    public abstract Vehicle clone();

    public abstract boolean isClone(Vehicle target);

}
