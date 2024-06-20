import java.util.Arrays;
import java.util.Scanner;

public class SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inpArr = Arrays.stream(sc.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int[] sortedArr = new int[inpArr.length];
        System.arraycopy(inpArr, 0, sortedArr, 0, inpArr.length);
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < sortedArr.length - j; i++) {
                if (sortedArr[i] > sortedArr[i + 1]) {
                    tmp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }
        for (int k = 0; k < 2; k++) {
            System.out.print(STR."\{sortedArr[k]} ");
        }
    }
}
