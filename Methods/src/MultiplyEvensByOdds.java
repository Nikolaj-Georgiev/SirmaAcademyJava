import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        System.out.println(multiplyEvensByOdds(number));

    }

    public static int multiplyEvensByOdds(String number) {
        int sumEvens = 0;
        int sumOdds = 0;
        for (int i = 0; i < number.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(number.charAt(i)));
            if (currentNum % 2 == 0) {
                sumEvens += currentNum;
            } else {
                sumOdds += currentNum;
            }
        }

        return (sumEvens * sumOdds);
    }
}
