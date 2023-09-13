package Iterator;

import java.util.Iterator;
import java.util.List;

public class ConcreteIterator implements Iterator<Integer> {
    private List<Integer> items;
    private int position;

    public ConcreteIterator(List<Integer> items) {
        this.items = items;
        this.position = 0;
    }

    @Override
    public Integer next() {
        return items.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    // @Override
    public Integer currentItem() {
        return items.get(position);
    }

    // @Override
    public Integer first() {
        return items.get(0);
    }
}
