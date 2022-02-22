package Task1;

public class Calculator {

    private int a;
    private int b;
    private String arithmeticAction;
    protected ArithmeticActionStrategy arithmeticActionStrategy;
    private Actions[] actions = Actions.values();
    private final ActionFactory actionFactory;

    public Calculator(ActionFactory actionFactory){
        this.actionFactory = actionFactory;
    }


    public Actions getArithmeticAction() {
        if ("+".equalsIgnoreCase(arithmeticAction)) {
            return Actions.ADDITION;
        }
        if ("-".equalsIgnoreCase(arithmeticAction)) {
            return Actions.SUBTRACTION;
        }
        if ("/".equalsIgnoreCase(arithmeticAction)) {
            return Actions.DIVISION;
        }
        if ("*".equalsIgnoreCase(arithmeticAction)) {
            return Actions.MULTIPLICATION;
        }
        return Actions.ADDITION;
    }

    public void setArithmeticAction(String arithmeticAction) {
        this.arithmeticAction = arithmeticAction;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int doAction() {
        arithmeticActionStrategy.calculate(this);
        return 0;
    }

    public int getCalculatedValue(Actions action) {
        Calculator act = actionFactory.createCalculator(action);
        Calculator[] actions = {new Addition(), new Subtraction(), new Division(), new Multiplication()};
        for (int i = 0; i < actions.length; i++) {
            if (this.getArithmeticAction().ordinal() == i){
                return actions[i].doAction();

            }
        }
        return 228;
    }
}
