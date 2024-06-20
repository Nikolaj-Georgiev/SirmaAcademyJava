import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        String operator = sc.nextLine();

        switch (operator) {
            case "add":
                System.out.printf("%.2f", (a + b));
                break;
            case "subtract":
                System.out.printf("%.2f", (a - b));
                break;
            case "multiply":
                System.out.printf("%.2f", (a * b));
                break;
            case "divide":
                if (b == 0) {
                    System.out.println("You can't divide by zero");
                    break;
                }
                System.out.printf("%.2f", a / b);
                break;
            default:
                System.out.println("Invalid operator");
        }
        sc.close();
    }
}
