import java.util.Scanner;

public class EqualSumOfOddAndEvenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        boolean isFound = false;

        for (int i = start + 1; i < end; i++) {
            int sumEven = 0;
            int sumOdd = 0;
            String currentNumAsString = Integer.toString(i);
            for (int j = 0; j < currentNumAsString.length(); j++) {
                int currentDigit = Character.getNumericValue(currentNumAsString.charAt(j));
                if (j % 2 == 0) {
                    sumEven += currentDigit;
                } else {
                    sumOdd += currentDigit;
                }
            }
            if (sumEven == sumOdd && (sumEven != 0)) {
                System.out.println(i);
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("None");
        }

    }
}
