import java.util.Arrays;
import java.util.Scanner;



public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputArr1 = sc.nextLine();
        String inputArr2 = sc.nextLine();
        int[] arr1 = Arrays.stream(inputArr1.split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(inputArr2.split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int len = Math.max(arr1.length, arr2.length);
        boolean isIdentical = true;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (arr1[i] != arr2[i]) {
                isIdentical = false;
                System.out.println(STR."Arrays are not identical. Found difference at \{i} index");
                break;
            }
        }
        if (isIdentical) {
            for (int i = 0; i < len; i++) {
                sum += arr1[i];
            }
            System.out.println(STR."Arrays are identical.Sum: \{sum}");
        }
    }
}
