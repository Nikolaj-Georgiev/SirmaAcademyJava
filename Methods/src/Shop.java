import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        shop(product, quantity);
    }

    public static void shop(String product, int quantity) {
        double coffeePrice = 1.50;
        double waterPrice = 1.00;
        double cokePrice = 1.40;
        double snacksPrice = 2.00;

        switch (product) {
            case "coffee":
                System.out.printf("%.2f", quantity * coffeePrice);
                break;
            case "water":
                System.out.printf("%.2f", quantity * waterPrice);
                break;
            case "coke":
                System.out.printf("%.2f", quantity * cokePrice);
                break;
            case "snacks":
                System.out.printf("%.2f", quantity * snacksPrice);
                break;
        }
    }
}
