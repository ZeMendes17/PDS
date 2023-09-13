package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<Integer> items;

    public ConcreteAggregate() {
        this.items = new ArrayList<>();
    }

    public void add(Integer item) {
        items.add(item);
    }

    @Override
    public Iterator<Integer> createIterator() {
        return new ConcreteIterator(items);
    }
}
