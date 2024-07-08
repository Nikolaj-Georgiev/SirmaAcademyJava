import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EmptyStackException;

public class Jar<T> {
    private Deque<T> content;
    private int size;

    public Jar() {
        this.content = new ArrayDeque<T>();
        this.size = 0;
    }

    public void add(T t) {
        this.content.push(t);
        this.size++;
    }

    public T remove() {
        if (this.size == 0) {
            throw new EmptyStackException();
        }
        size--;
        return this.content.pop();
    }

}
