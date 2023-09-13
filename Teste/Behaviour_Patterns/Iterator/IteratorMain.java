package Iterator;

import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add(1);
        aggregate.add(2);
        aggregate.add(3);
        aggregate.add(4);
        aggregate.add(5);

        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Output:
    // 1
    // 2
    // 3
    // 4
    // 5
}
