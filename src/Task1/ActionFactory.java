package Task1;

public class ActionFactory {

    public Calculator createCalculator (Actions action){
        Calculator calculator = null;
        switch (action) {
            case ADDITION:
                calculator = new Addition();
                break;
            case SUBTRACTION:
                calculator = new Subtraction();
                break;
            case DIVISION:
                calculator = new Division();
                break;
            case MULTIPLICATION:
                calculator = new Multiplication();
                break;
        }
        return calculator;
    }
}
