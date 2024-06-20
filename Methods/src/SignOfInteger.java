import java.util.Scanner;

public class SignOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        signOfInteger(n);
    }

    private static void signOfInteger(int x) {
        if (x < 0) {
            System.out.println(STR."The number \{x} is negative.");
        } else {
            System.out.println(STR."The number \{x} is positive.");
        }
    }
}
