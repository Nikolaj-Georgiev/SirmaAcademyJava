package CustomList;

public class GenericList<E extends Comparable<E>> {
    private static final int INITIAL_CAPACITY = 4;
    private E[] elements;
    private int capacity;
    private int size;

    public GenericList() {
        this.elements = (E[]) new Comparable[INITIAL_CAPACITY];
        this.capacity = INITIAL_CAPACITY;
        this.size = 0;
    }

    public void add(E element) {
        if (size + 1 > capacity) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public int countGreaterThen(E item) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (elements[i].compareTo(item) > 0) {
                count++;
            }
        }
        return count;
    }

    private void ensureCapacity() {
        E[] newElements = (E[]) new Comparable[elements.length * 2];
        System.arraycopy(elements,
                0,
                newElements,
                0,
                elements.length);
        this.capacity = elements.length * 2;
        elements = newElements;
    }

    public E remove(int index) {
        if (size >= index || index < 0) {
            throw new IndexOutOfBoundsException(STR."Index \{index} is out of bound");
        }
        E removedElement = this.elements[index];
        for (int i = index; i < size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.elements[size - 1] = null;
        this.size--;
        return removedElement;
    }

    public int size() {
        return size;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void swap(int i, int j) {
        if (i == j) {
            return;
        }
        if (i < 0 || i >= size || j < 0 || j >= size) {
            throw new IndexOutOfBoundsException("One of the indexes is out of bound");
        }
        E temp = this.elements[i];
        this.elements[i] = this.elements[j];
        this.elements[j] = temp;
    }

    public E getMax() {
        E max = this.elements[0];
        for (int i = 1; i < size; i++) {
            if (this.elements[i].compareTo(max) > 0) {
                max = this.elements[i];
            }
        }
        return max;
    }

    public E getMin() {
        E min = this.elements[0];
        for (int i = 1; i < size; i++) {
            if (this.elements[i].compareTo(min) < 0) {
                min = this.elements[i];
            }
        }
        return min;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(elements[i]);
        }
    }

}