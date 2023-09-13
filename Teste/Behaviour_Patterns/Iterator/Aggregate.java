package Iterator;

import java.util.Iterator;

// Iterator pattern -- aggregate interface
public interface Aggregate {
    Iterator<Integer> createIterator();
}


