package builder;

public class Client {
    public static void main(String[] args) {
        ApartmentBuilder apartmentBuilder = new ApartmentBuilder();

        Apartment apartment1 = apartmentBuilder.setSqm(25).setRooms(2).setCity("London").setArea("Kensington").setHasKitchen(true).build();
        apartment1.display();

        Apartment apartment2 = apartmentBuilder.setRooms(3).setCity("Paris").build();
        apartment2.display();
    }
}
