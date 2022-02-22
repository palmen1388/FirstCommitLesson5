package Task1;

public class SubtractionStrategy implements ArithmeticActionStrategy {

    @Override
    public int calculate(Calculator calculator) {
        return calculator.getA() - calculator.getB();
    }
}
