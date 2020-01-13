package BusinessRule;

public class Category {
    private String name;

    public Category(String name) {
        this.name = name;
    }

    public Category getCategoryObject(String name) {
        return new Category(name);
    }
}
