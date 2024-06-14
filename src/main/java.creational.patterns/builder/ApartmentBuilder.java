package builder;

public class ApartmentBuilder {
    private int sqm = -1;
    private int rooms = -1;
    private String city = "";
    private String area = "";
    private boolean hasKitchen = false;

    public ApartmentBuilder setSqm(int sqm) {
        this.sqm = sqm;
        return this;
    }

    public ApartmentBuilder setRooms(int rooms) {
        this.rooms = rooms;
        return this;

    }

    public ApartmentBuilder setCity(String city) {
        this.city = city;
        return this;

    }

    public ApartmentBuilder setArea(String area) {
        this.area = area;
        return this;

    }

    public ApartmentBuilder setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
        return this;
    }
    public Apartment build(){
        Apartment apartment = new Apartment(sqm,rooms,city,area,hasKitchen);
        sqm= -1;
        rooms= -1;
        city = "";
        area = "";
        hasKitchen = false;
        return apartment;
    }
}
