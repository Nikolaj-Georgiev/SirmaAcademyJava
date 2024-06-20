import java.util.Scanner;

public class NumbersUpTo1000EndingInN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= 1000; i++) {
            if (i % 10 == n) System.out.println(i);
        }
    }
}
