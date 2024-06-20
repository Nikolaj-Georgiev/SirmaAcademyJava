import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastKNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.nextLine());
        int[] arr = Arrays.stream(sc.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int[] firstK = new int[k];
        int[] lastK = new int[k];
        for (int i = 0; i < k; i++) {
            firstK[i] = arr[i];
            lastK[i] = arr[arr.length - 1 - i];
        }
        for (int j = 0; j < k; j++) {
            System.out.print(STR."\{firstK[j]} ");
        }
        System.out.println();
        for (int l = k - 1; l >= 0; l--) {
            System.out.print(STR."\{lastK[l]} ");
        }
    }
}
