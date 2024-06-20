import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        String command = sc.nextLine();
        double b = Double.parseDouble(sc.nextLine());

        switch (command) {
            case "+":
                add(a, b);
                break;
            case "-":
                subtract(a, b);
                break;
            case "*":
                multiply(a, b);
                break;
            case "/":
                divide(a, b);
                break;
        }

    }

    public static void add(double x, double y) {
        System.out.printf("%.2f", x + y);
    }

    public static void subtract(double x, double y) {
        System.out.printf("%.2f", x - y);
    }

    public static void multiply(double x, double y) {
        System.out.printf("%.2f", x * y);
    }

    public static void divide(double x, double y) {
        if (y == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.printf("%.2f", x / y);
        }
    }
}
