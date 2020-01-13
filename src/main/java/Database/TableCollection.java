package Database;

import java.util.ArrayList;
import java.util.List;

public class TableCollection implements IterableCollection {
    private List<Table> tables = new ArrayList<Table>();

    public void addTable(Table table) { this.tables.add(table); }

    public void setTables(List<Table> tables) { this.tables = tables; }

    public Iterator createIterator() { return new TableIterator(); }
}
