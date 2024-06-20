import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());

        switch (command){
            case "add":
                add(a, b);
                break;
            case "subtract":
                subtract(a, b);
                break;
            case "multiply":
                multiply(a, b);
                break;
            case "divide":
                divide(a, b);
                break;
        }
    }

    public static void add(double x, double y) {
        System.out.printf("%.0f", x + y);
    }
    public static void subtract(double x, double y) {
        System.out.printf("%.0f", x - y);
    }
    public static void multiply(double x, double y) {
        System.out.printf("%.0f", x * y);
    }
    public static void divide(double x, double y) {
        if (y == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.printf("%.2f", x / y);
        }
    }
}
