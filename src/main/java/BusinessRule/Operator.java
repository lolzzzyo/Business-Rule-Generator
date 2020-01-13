package BusinessRule;

public class Operator {
    private String name;

    public Operator(String name) {
        this.name = name;
    }

    public Operator getOperatorObject(String name) {
        return new Operator(name);
    }
}
