package Task1;

public class Division extends Calculator{

    @Override
    public int doAction() {
        this.arithmeticActionStrategy = new DivisionStrategy();
        return arithmeticActionStrategy.calculate(this);
    }
}
