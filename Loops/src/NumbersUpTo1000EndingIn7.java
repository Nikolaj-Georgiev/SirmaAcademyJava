public class NumbersUpTo1000EndingIn7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            if (i % 10 == 7) System.out.println(i);
        }
    }
}
