import java.util.Scanner;

public class StaircasePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                for (int k = 1; k < j; k++) {
                    System.out.print(" ");
                }
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
