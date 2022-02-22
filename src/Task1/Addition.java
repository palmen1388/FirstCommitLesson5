package Task1;

public class Addition extends Calculator{

    @Override
    public int doAction(){
        this.arithmeticActionStrategy = new AdditionStrategy();
        return arithmeticActionStrategy.calculate(this);
    }
}
