import java.util.Scanner;

public class ChangeNew {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input value
        double enteredValue = Double.parseDouble(sc.nextLine());
        int valueInCoins = (int) Math.round(enteredValue * 100);
        int numberOfCoins = 0;

        // Process each denomination from largest to smallest
        if (valueInCoins >= 200) {
            numberOfCoins += valueInCoins / 200;
            valueInCoins %= 200;
        }
        if (valueInCoins >= 100) {
            numberOfCoins += valueInCoins / 100;
            valueInCoins %= 100;
        }
        if (valueInCoins >= 50) {
            numberOfCoins += valueInCoins / 50;
            valueInCoins %= 50;
        }
        if (valueInCoins >= 20) {
            numberOfCoins += valueInCoins / 20;
            valueInCoins %= 20;
        }
        if (valueInCoins >= 10) {
            numberOfCoins += valueInCoins / 10;
            valueInCoins %= 10;
        }
        if (valueInCoins >= 5) {
            numberOfCoins += valueInCoins / 5;
            valueInCoins %= 5;
        }
        if (valueInCoins >= 2) {
            numberOfCoins += valueInCoins / 2;
            valueInCoins %= 2;
        }
        if (valueInCoins >= 1) {
            numberOfCoins += valueInCoins / 1;
            valueInCoins %= 1;
        }

        // Print the result
        System.out.println(numberOfCoins);
    }

}
