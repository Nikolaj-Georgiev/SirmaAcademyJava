public class Main {
    public static void main(String[] args) {
        String[] strArr = ArrayCreator.create(String.class, 3, "Hello");
        Integer[] intArr = ArrayCreator.create(1, 10);
        System.out.println(strArr[0]);
        System.out.println(intArr[0]);

    }
}