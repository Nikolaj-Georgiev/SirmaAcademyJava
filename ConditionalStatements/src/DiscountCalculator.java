import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = Integer.parseInt(sc.nextLine());
        boolean membership = ((sc.nextLine().equals("Yes")));
        int discount = 10;

        if (age <= 0) {
            sc.close();
            return;
        }

        if (age > 65) {
            discount = 30;
        } else if (age > 17) {
            if (membership) {
                discount = 20;
            }
        }

        System.out.println(discount + "% discount");
        sc.close();
    }
}
