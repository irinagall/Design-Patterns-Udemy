package builder;

public class Apartment {
    //NO SETTERS in this class

    private int sqm;
    private int rooms;
    private String city;
    private String area;
    private boolean hasKitchen;

    public Apartment(int sqm, int rooms, String city, String area, boolean hasKitchen) {
        this.sqm = sqm;
        this.rooms = rooms;
        this.city = city;
        this.area = area;
        this.hasKitchen = hasKitchen;
    }

    public int getSqm() {
        return sqm;
    }

    public int getRooms() {
        return rooms;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public boolean isHasKitchen() {
        return hasKitchen;
    }

    public void display(){
        System.out.println(" ");
        System.out.println("Apartment has: ");
        if(sqm!= -1){
            System.out.println(sqm + " sqm");
        }
        if(rooms!= -1){
            System.out.println(rooms + " rooms");
        }
        if(city!= ""){
            System.out.println(city + " city");
        }
        if(area!= ""){
            System.out.println(area + " area");
        }
        if(hasKitchen){
            System.out.println("Apartment has a kitchen");
        }
        System.out.println(" ");
    }
}
