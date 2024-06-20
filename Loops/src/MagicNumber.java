import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int magicNumber = Integer.parseInt(sc.nextLine());

        if (start >= end || start < 0 || end > 1000 || magicNumber < 1 || magicNumber > 10000) {
            System.out.println("Please, enter valid data");
            return;
        }

        String result = "";
        int count = 0;
        boolean isMagicNumber = false;
        for (int i = start; i <= end; i++) {
            if (isMagicNumber) {
                break;
            }
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magicNumber) {
                    isMagicNumber = true;
                    result = "Combination " + (i * j) + " - (" + i + " + " + j + " = " + magicNumber + ")";
                }
            }
        }
        if (!isMagicNumber) {
            result = count + " combinations - neither equals " + magicNumber;
        }

        System.out.println(result);
    }
}
