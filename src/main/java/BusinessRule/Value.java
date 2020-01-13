package BusinessRule;

public class Value {
    private String value;

    public Value(String value) {
        this.value = value;
    }

    public Value getValueObject(String value) {
        return new Value(value);
    }
}
