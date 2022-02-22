package Task1;

public class Multiplication extends Calculator{

    @Override
    public int doAction() {
        this.arithmeticActionStrategy = new MultiplicationStrategy();
        return arithmeticActionStrategy.calculate(this);
    }
}
