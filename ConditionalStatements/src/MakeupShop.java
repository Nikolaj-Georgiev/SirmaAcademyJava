import java.util.Scanner;

public class MakeupShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double powderPrice = 2.60;
        double lipstickPrice = 3;
        double spiralPrice = 4.10;
        double shadowsPrice = 8.20;
        double concealerPrice = 2;

        double renovationPrice = Double.parseDouble(sc.nextLine());
        int powderCount = Integer.parseInt(sc.nextLine());
        int lipstickCount = Integer.parseInt(sc.nextLine());
        int spiralCount = Integer.parseInt(sc.nextLine());
        int shadowsCount = Integer.parseInt(sc.nextLine());
        int concealerCount = Integer.parseInt(sc.nextLine());

        int markupOrderCount = powderCount + lipstickCount + spiralCount + shadowsCount + concealerCount;
        double totalPrice = (powderPrice * powderCount) + (lipstickPrice * lipstickCount) + (spiralPrice * spiralCount)
                + (concealerPrice * concealerCount) + (shadowsPrice * shadowsCount);

        if (markupOrderCount >= 50) {
            totalPrice = totalPrice * 0.75;
        }

        double finalIncome = totalPrice * 0.90;
        double moneyLeft = finalIncome - renovationPrice;

        if (moneyLeft >= 0) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money!%n%.2f lv needed.", Math.abs(moneyLeft));
        }

        sc.close();
    }
}
