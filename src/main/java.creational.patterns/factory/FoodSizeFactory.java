package factory;

public class FoodSizeFactory {
    public Size getFood(String type){
        if(type == null){
            return null;
        }
        return switch (type) {
            case "Medium" -> new Pizza();
            case "Small" -> new Sushi();
            default -> throw new IllegalArgumentException("Unknown size");
        };
    }
}
