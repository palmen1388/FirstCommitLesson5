package Task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DrinkMachine drinkMachine = new DrinkMachine(new DrinkFactory());
        drinkMachine.printDrinks();
        drinkMachine.setUserValue(scanner.nextLine());
        System.out.println("Стоимость составит " + drinkMachine.getFinalPrice(drinkMachine.getUserValue()) + " рублей");
    }
}
