import java.util.Scanner;

public class Numbers1ToNThrough2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i+=2) {
            System.out.println(i);
        }
    }
}
