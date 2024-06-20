import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n + (n - 1)); j++) {
                if (j == 1 || j == (n + (n - 1))) {
                    if (i == 1 || i == n) {
                        System.out.print("*");
                    } else {
                        System.out.print("|");
                    }
                } else if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("-");
                }

                if (j == (n + (n - 1))) {
                    System.out.println();
                }
            }
        }
    }
}
