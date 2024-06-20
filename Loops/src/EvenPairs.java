import java.util.Scanner;

public class EvenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstStart = Integer.parseInt(sc.nextLine());
        int secondStart = Integer.parseInt(sc.nextLine());
        int firstEnd = Integer.parseInt(sc.nextLine());
        int secondEnd = Integer.parseInt(sc.nextLine());
        int pairOneEnd = firstStart + firstEnd;
        int pairTwoEnd = secondStart + secondEnd;
        boolean isOnePrime = false;
        boolean isTwoPrime = false;


        for (int i = firstStart; i <= pairOneEnd; i++) {
            for (int j = secondStart; j <= pairTwoEnd; j++) {
                String result = i + "" + j;
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                    isOnePrime = true;
                }

                if (j % 2 != 0 && j % 3 != 0 && j % 5 != 0 && j % 7 != 0) {
                    isTwoPrime = true;
                }

                if (isOnePrime && isTwoPrime) {
                    System.out.println(result);

                }
                isOnePrime = false;
                isTwoPrime = false;
            }
        }
    }
}
