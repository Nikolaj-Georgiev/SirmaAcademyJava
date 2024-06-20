import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        System.out.println(calculateRectangleArea(a, b));
    }

    public static int calculateRectangleArea(int width, int height) {
        return width * height;
    }
}
