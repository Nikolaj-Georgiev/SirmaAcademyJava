import java.util.Scanner;

public class HourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n + 2; i++) {
            System.out.print("#");
        }
        System.out.println();
        // Горна част
        for (int i = 1; i <= (n + 1) / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print(" ");
            }

            if (n - 2 * i >= 0) {
                System.out.print("#");
            }
            System.out.println();
        }
        // Долна част
        for (int i = (n + 1) / 2 - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("#");
            for (int j = 0; j < n - 2 * i; j++) {
                System.out.print(" ");
            }
            if (n - 2 * i >= 0) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 0; i < n + 2; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
