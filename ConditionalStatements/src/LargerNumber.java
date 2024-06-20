import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstInput = sc.nextLine();
        String secondInput = sc.nextLine();
        int firstNumber = Integer.parseInt(firstInput);
        int secondNumber = Integer.parseInt(secondInput);

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber);
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber);
        }

        sc.close();
    }
}
