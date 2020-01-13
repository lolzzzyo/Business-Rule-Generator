package BusinessRule;

import Database.DatabaseService;
import Generate.GenerateService;

import java.util.List;

public class BusinessRule {
    private String name;
    private int code;
    private String status;
    private String description;
    private String errorMessage;
    private List<Value> values;
    private Operator operator;
    private BusinessRuleType businessRuleType;

    private DatabaseService databaseService;
    private GenerateService generateService;

    public BusinessRule(String name, String description) {
        this.name = name;
        this.description = description;
        this.status = "inactive";
    }



}
