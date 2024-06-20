import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] inpArr = Arrays.stream(input.split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < inpArr.length; i++) {
            if (inpArr[i] % 2 == 0) {
                sumEven += inpArr[i];
            } else {
                sumOdd += inpArr[i];
            }
        }
        System.out.println(sumEven - sumOdd);

    }
}
