import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        if (month % 2 == 0 && month != 2 && month != 8) {
            System.out.println(30);
        } else if (month % 2 != 0 || month == 8) {
            System.out.println(31);
        } else {
            System.out.println(28);
        }

        sc.close();
    }
}
