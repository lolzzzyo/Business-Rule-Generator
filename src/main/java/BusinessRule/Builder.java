package BusinessRule;

import Database.Table;

public interface Builder {
    public void setErrorMessage(String errorMessage);
    public void addTable(Table table);
    public void addValue(Value value);
    public void setOperator(Operator operator);
    public void setBusinessRuleType (BusinessRuleType businessRuleType);
}
