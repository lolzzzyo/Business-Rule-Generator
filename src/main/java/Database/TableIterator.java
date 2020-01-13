package Database;

import java.util.ArrayList;
import java.util.List;

public class TableIterator implements Iterator {
    private List<Table> tableList = new ArrayList<Table>();
    private int currentPosition = 0;

    public TableIterator() { lazyLoad(); }

    private void lazyLoad() {
        //haal uit db
    }

    public Table next() {
        if (!hasNext()) {
            return null;
        }

        Table table = tableList.get(currentPosition);
        currentPosition++;
        return table;
    }

    public boolean hasNext() {
        lazyLoad();
        return currentPosition < tableList.size();
    }

    public void reset() {
        currentPosition = 0;
    }

    public void remove(Table table) {
        tableList.remove(table);
    }
}
