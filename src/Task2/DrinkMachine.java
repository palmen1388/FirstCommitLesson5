package Task2;

public class DrinkMachine {

    private String userValue;
    private final DrinkFactory drinkFactory;
    private DrinkType[] drinkTypes = DrinkType.values();

    public DrinkMachine(DrinkFactory drinkFactory) {
        this.drinkFactory = drinkFactory;
    }

    public void printDrinks() {
        int i = 1;
        for (DrinkType drinkType : drinkTypes) {
            System.out.println(i + "." + drinkType.type);
            i++;
        }
    }


    public DrinkType getUserValue() {
        if ("1".equalsIgnoreCase(userValue)){
            return DrinkType.TEA;
        }
        if ("2".equalsIgnoreCase(userValue)){
            return DrinkType.COFFEE;
        }
        if ("3".equalsIgnoreCase(userValue)){
            return DrinkType.MILK_TEA;
        }
        if ("4".equalsIgnoreCase(userValue)){
            return DrinkType.MILK_COFFEE;
        }
        if ("5".equalsIgnoreCase(userValue)){
            return DrinkType.CINNAMON_MILK_TEA;
        }
        if ("6".equalsIgnoreCase(userValue)){
            return DrinkType.CINNAMON_MILK_COFFEE;
        }
        return DrinkType.TEA;
    }

    public void setUserValue(String userValue) {
        this.userValue = userValue;
    }

    public int getFinalPrice(DrinkType drinkType) {
        Drink drink = drinkFactory.chooseDrink(this.getUserValue());
        return drink.getPrice();
    }
}
