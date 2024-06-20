import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int childPrice = 5;
        int teenPrice = 8;
        int adultPrice = 10;
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("invalid age");
            sc.close();
            return;
        }

        if (age >= 20) {
            System.out.printf("$%d", adultPrice);
        } else if (age > 12) {
            System.out.printf("$%d", teenPrice);
        } else {
            System.out.printf("$%d", childPrice);
        }

        sc.close();
    }
}
