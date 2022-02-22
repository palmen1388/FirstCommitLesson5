package Task1;

public enum Actions {

    ADDITION("+"),
    SUBTRACTION("-"),
    DIVISION("/"),
    MULTIPLICATION("*");

    private String value;

    Actions (String value){
        this.value = value;
    }
}
