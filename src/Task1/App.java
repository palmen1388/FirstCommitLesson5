package Task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        calculator.setArithmeticAction(scanner.nextLine());
        calculator.setA(scanner.nextInt());
        calculator.setB(scanner.nextInt());
        System.out.println(calculator.getCalculatedValue());
    }
}
