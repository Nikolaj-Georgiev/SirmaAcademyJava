import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Math.abs(Integer.parseInt(sc.nextLine()));

        if (n <= 0) {
            System.out.println("Try again with a valid number (higher then 0)");
            return;
        }

        String result = n + " ";

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }

            if (n == 1) {
                result += n;
            } else {
                result += n + " ";
            }
        }

        System.out.println(result);
    }
}
