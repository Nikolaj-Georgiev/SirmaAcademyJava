public class GenericList<E> {
    private static final int INITIAL_CAPACITY = 4;
    private E[] elements;
    private int size;

    public GenericList() {
        elements = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public void add(E element) {
        if (size == elements.length) {
            E[] newElements = (E[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }

        elements[size++] = element;
    }

    public E remove() {
        if (size == 0) {
            return null;
        }
        E element = elements[--size];
        elements[size] = null;
        return element;
    }


}
