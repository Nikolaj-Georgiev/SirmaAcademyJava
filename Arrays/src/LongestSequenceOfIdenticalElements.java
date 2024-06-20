import java.util.Arrays;
import java.util.Scanner;

public class LongestSequenceOfIdenticalElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inpArr = Arrays.stream(sc.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int start = 0;
        int end = 0;
        boolean isLongest = false;
        int[] longestSeq = new int[1];
        int counter = 0;
        for (int i = 0; i < inpArr.length; i++) {
            if (inpArr[i] == inpArr[Math.min((i + 1), inpArr.length - 1)]) {
                if (!isLongest) {
                    start = i;
                }
                isLongest = true;
            }
            if (inpArr[i] != inpArr[Math.min((i + 1), inpArr.length - 1)] && isLongest || isLongest && i == inpArr.length - 1) {
                end = i;
            }
            if (end != 0 && isLongest) {
                int[] longest = new int[counter + 1];
                for (int j = start; j <= end; j++) {
                    longest[Math.max(j - start, 0)] = inpArr[j];
                }
                if (longest.length > longestSeq.length) {
                    longestSeq = longest;
                } else if (longest.length == longestSeq.length) {
                    longestSeq = longest;
                }
                isLongest = false;
                end = 0;
                start = 0;
                counter = 0;
            }
            if (isLongest) {
                counter++;
            }
        }
        for (int element : longestSeq) {
            System.out.print(STR."\{element} ");
        }
    }
}
