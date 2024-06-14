package prototype;

public class Bicyle extends Vehicle{
    private boolean isCityBike;

    public Bicyle(int wheels, long price, boolean isCityBike){
        this.wheels = wheels;
        this.price = price;
        this.isCityBike = isCityBike;
    }
    public Bicyle(Bicyle target){
        super(target);
        if(target != null){
            this.isCityBike = target.isCityBike;
        }
    }

    @Override
    public Vehicle clone() {
        return new Bicyle(this);
    }

    @Override
    public boolean isClone(Vehicle target) {
        if(target instanceof Bicyle){
            Bicyle targ = (Bicyle) target;
            if (isCityBike == targ.isCityBike && wheels == targ.wheels && price == this.price){
                System.out.println(this + " and " + targ + " are clones.");
                return true;
            }
        }
        System.out.println(this + " and " + target + " are not clones." );
        return false;
    }
}
