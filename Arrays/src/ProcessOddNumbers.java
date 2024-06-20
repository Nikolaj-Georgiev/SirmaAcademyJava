import java.util.Arrays;
import java.util.Scanner;

public class ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArr = Arrays.stream(sc.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int[] resultArr = new int[inputArr.length / 2];
        int counter = 0;
        for (int i = 1; i < inputArr.length; i++) {
            if (i % 2 != 0) {
                resultArr[counter] = inputArr[i];
                counter++;
            }
        }
        for (int i = resultArr.length - 1; i >= 0; i--) {
            System.out.print(STR."\{resultArr[i] * 2} ");
        }
    }
}
