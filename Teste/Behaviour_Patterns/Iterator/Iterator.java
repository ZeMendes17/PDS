package Iterator;

// Iterator pattern -- iterator interface
public interface Iterator<T> {
    T first();
    T next();
    boolean hasNext();
    T currentItem();
}
