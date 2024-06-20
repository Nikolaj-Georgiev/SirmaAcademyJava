import java.util.Scanner;

public class UniqueCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNumber = Integer.parseInt(sc.nextLine());
        int secondNumber = Integer.parseInt(sc.nextLine());
        int thirdNumber = Integer.parseInt(sc.nextLine());

        for (int i = 2; i <= firstNumber; i += 2) {
            for (int j = 2; j <= secondNumber; j += 2) {
                for (int k = 2; k <= thirdNumber; k += 2) {
                    System.out.println(i + " " + j + " " + k);
                }
                if (j == 2) {
                    j--;
                }

            }
        }

    }
}

