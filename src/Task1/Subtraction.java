package Task1;

public class Subtraction extends Calculator{

    @Override
    public int doAction() {
        this.arithmeticActionStrategy = new SubtractionStrategy();
        return arithmeticActionStrategy.calculate(this);
    }
}
