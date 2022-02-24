package Task2;

public class DrinkFactory {


    public Drink chooseDrink(DrinkType drinkType) {
        Drink drink = null;
        System.out.println(drinkType);
        switch (drinkType) {
            case TEA:
                drink = new Tea();
                break;
            case COFFEE:
                drink = new Coffee();
                break;
            case MILK_TEA:
                drink = new MilkTea();
                break;
            case MILK_COFFEE:
                drink = new MilkCoffee();
                break;
            case CINNAMON_MILK_TEA:
                drink = new CinnamonMilkTea();
                break;
            case CINNAMON_MILK_COFFEE:
                drink = new CinnamonMilkCoffee();
                break;
        }
        return drink;
    }
}
