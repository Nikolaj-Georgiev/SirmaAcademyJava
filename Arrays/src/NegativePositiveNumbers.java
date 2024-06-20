import java.util.Arrays;
import java.util.Scanner;

public class NegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inpArr = Arrays.stream(sc.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int[] positive = new int[inpArr.length];
        int[] negative = new int[inpArr.length];
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 0; i < inpArr.length; i++) {
                if (inpArr[i] >= 0){
                    positive[positiveCount] = inpArr[i];
                    positiveCount++;
                } else {
                    negative[negativeCount] = inpArr[i];
                    negativeCount++;
                }
        }
        int[]positiveResult = new int[positiveCount];
        int[]negativeResult = new int[negativeCount];
        System.arraycopy(positive, 0, positiveResult, 0, positiveCount);
        System.arraycopy(negative, 0, negativeResult, 0, negativeCount);
        for (int j = negativeResult.length -1; j >= 0;j--) {
            System.out.println(negativeResult[j]);
        }
        for (int k : positiveResult) {
            System.out.println(k);
        }
    }
}
