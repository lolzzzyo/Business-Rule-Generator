package Database;

public interface Iterator {
    public Table next();
    public boolean hasNext();
    public void remove(Table table);
    public void reset();
}
