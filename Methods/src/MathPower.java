import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());
        System.out.printf("%.2f", power(number, power));
    }

    public static double power(double number, int power) {
        return Math.pow(number, power);
    }
}
