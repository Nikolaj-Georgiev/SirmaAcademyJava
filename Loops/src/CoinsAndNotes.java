import java.util.Scanner;

public class CoinsAndNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oneLvCoins = Integer.parseInt(sc.nextLine());
        int twoLvCoins = Integer.parseInt(sc.nextLine());
        int fiveLvCoins = Integer.parseInt(sc.nextLine());
        int sumOfLeva = Integer.parseInt(sc.nextLine());

        int versions = 0;

        for (int i = 0; i <= oneLvCoins; i++) {
            for (int j = 0; j <= twoLvCoins; j++) {
                for (int k = 0; k <= fiveLvCoins; k++) {
                    int tempSum = i * 1 + j * 2 + k * 5;
                    if (tempSum == sumOfLeva) {
                        System.out.printf("Version: %d%n", ++versions);
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", i, j, k, sumOfLeva);
                    }
                }
            }
        }
    }
}
