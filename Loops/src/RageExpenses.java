import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());
        double rageExpenses = 0;

        int displayCounter = 0;
        for (int i = 1; i <= lostGamesCount; i++) {
            if (i % 2 == 0) {
                rageExpenses += headsetPrice;
            }

            if (i % 3 == 0) {
                rageExpenses += mousePrice;
            }

            if (i % 2 == 0 && i % 3 == 0) {
                displayCounter++;
                rageExpenses += keyboardPrice;
            }

            if (displayCounter % 2 == 0 && displayCounter != 0) {
                rageExpenses += displayPrice;
                displayCounter = 0;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", rageExpenses);
    }
}
