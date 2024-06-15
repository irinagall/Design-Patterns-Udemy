package factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodSizeFactoryTest {
    FoodSizeFactory foodFactory = new FoodSizeFactory();
    Size mediumFood = foodFactory.getFood("Medium");
    Size smallFood = foodFactory.getFood("Small");

    @Test
    @DisplayName("expect mediumFood type to return Medium")
    void expectMediumFoodTypeToReturnMedium(){
        assertEquals("Medium", mediumFood.getSize());
    }

    @Test
    @DisplayName("expect sushi to return anything but Small")
    void expectSushiToReturnAnythingBut(){
        assertNotEquals("Small", mediumFood.getSize());


    }
}