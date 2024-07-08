import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    public static <T> T[] create(int length, T item) {
        if (length < 1) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        T[] array = (T[]) Array.newInstance(item.getClass(), length);
        Arrays.fill(array, item);
        return array;
    }

    public static <T> T[] create(Class<T> classs, int length, T item) {
        if (length < 1) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        T[] array = (T[]) Array.newInstance(classs, length);
        Arrays.fill(array, item);
        return array;
    }

}
