import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] inpArr = Arrays.stream(input.split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        if (inpArr.length == 1) {
            System.out.println(inpArr[0]);
            return;
        }
        while (inpArr.length > 1) {
            int[] condensed = new int[inpArr.length - 1];
            for (int i = 0; i < inpArr.length - 1; i++) {
                if (i == inpArr.length - 1) {
                    break;
                }
                condensed[i] = inpArr[i] + inpArr[i + 1];
            }
            inpArr = condensed;
        }
        System.out.println(inpArr[0]);

    }
}
