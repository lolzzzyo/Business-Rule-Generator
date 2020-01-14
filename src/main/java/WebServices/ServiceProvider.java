package WebServices;

import Services.BusinessRuleService;
import Services.DatabaseService;
import Services.GenerateService;

public class ServiceProvider {
    private static BusinessRuleService businessRuleService = new BusinessRuleService();
    private static GenerateService generateService = new GenerateService();
    private static DatabaseService databaseService = new DatabaseService();

    public static BusinessRuleService getBusinessRuleService() { return businessRuleService; }
    public static GenerateService getGenerateService() { return generateService; }
    public static DatabaseService getDatabaseService() { return databaseService; }
}
