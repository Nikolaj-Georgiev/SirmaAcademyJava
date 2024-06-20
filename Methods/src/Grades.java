import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        grades(n);
    }

    private static void grades(Double x) {
        if (2.00 <= x && x <= 2.99) {
            System.out.println("Fail");
        } else if (3.00 <= x && x <= 3.49) {
            System.out.println("Poor");
        } else if (3.50 <= x && x <= 4.49) {
            System.out.println("Good");
        } else if (4.50 <= x && x <= 5.49) {
            System.out.println("Very Good");
        } else if (5.50 <= x && x <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
