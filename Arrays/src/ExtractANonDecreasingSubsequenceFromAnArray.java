import java.util.Arrays;
import java.util.Scanner;

public class ExtractANonDecreasingSubsequenceFromAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split("[, ]+")).mapToInt(Integer::parseInt).toArray();
        int biggest = 0;
        int[] newArr = new int[arr.length];
        int counter = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] >= biggest){
                biggest = arr[i];
                newArr[counter] = arr[i];
                counter++;
            }
        }
        int[] resultArr = new int[counter];
        System.arraycopy(newArr, 0, resultArr, 0, counter);
        for (int j : resultArr) {
            System.out.print(STR."\{j} ");
        }
    }
}
