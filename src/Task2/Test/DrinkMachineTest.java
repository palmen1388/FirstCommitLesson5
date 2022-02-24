package Task2.Test;

import Task2.DrinkFactory;
import Task2.DrinkMachine;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrinkMachineTest {

    @Test
    public void Test(){
        DrinkMachine drinkMachine = new DrinkMachine(new DrinkFactory());
        drinkMachine.setUserValue("Чай с молоком");
        assertEquals(13, drinkMachine.getFinalPrice(drinkMachine.getUserValue()));
    }
}