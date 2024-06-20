import java.util.Scanner;

public class LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int k = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            int[] tempArr = new int[k];
            if (i - k < 0) {
                System.arraycopy(arr, 0, tempArr, 0, tempArr.length);
            } else {
                System.arraycopy(arr, i - k, tempArr, 0, tempArr.length);
            }
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += tempArr[j];
            }
            arr[i] = sum;
        }
        for (int i : arr) {
            System.out.print(STR."\{i} ");
        }
    }
}

