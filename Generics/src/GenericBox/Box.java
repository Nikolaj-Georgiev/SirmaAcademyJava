package GenericBox;


public class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return STR."\{this.item.getClass().getCanonicalName()}: \{this.item}";
    }
}
