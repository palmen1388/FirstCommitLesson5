package Task1;

public class MultiplicationStrategy implements ArithmeticActionStrategy {

    @Override
    public int calculate(Calculator calculator) {
        return calculator.getA() * calculator.getB();
    }
}
