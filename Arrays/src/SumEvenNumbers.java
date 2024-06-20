import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inpArr = input.split("[, ]+");
        int[] arr = Arrays.stream(inpArr).mapToInt(Integer::parseInt).toArray();

        int sumEvenNums = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumEvenNums += arr[i];
            }
        }

        System.out.println(sumEvenNums);
    }
}
