import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print(" ");
                if (j == 0 && i != 0) {
                    int counter = 0;
                    do {
                        System.out.print("*");
                        counter++;
                    } while (counter != n - (n - i));
                }
            }
            System.out.print(" | ");

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
