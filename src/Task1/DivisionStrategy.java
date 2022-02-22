package Task1;

public class DivisionStrategy implements ArithmeticActionStrategy {

    @Override
    public int calculate(Calculator calculator) {
        return calculator.getA() / calculator.getB();
    }
}
