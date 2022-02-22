package Task1;

public class AdditionStrategy implements ArithmeticActionStrategy {

    @Override
    public int calculate(Calculator calculator) {
        return calculator.getA() + calculator.getB();
    }
}
