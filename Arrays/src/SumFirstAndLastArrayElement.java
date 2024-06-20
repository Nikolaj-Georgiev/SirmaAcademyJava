import java.util.Arrays;
import java.util.Scanner;

public class SumFirstAndLastArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] inpArr = input.split("[, ]+");
        int [] arr = Arrays.stream(inpArr).mapToInt(Integer::parseInt).toArray();
        int sum = arr[0] + arr[arr.length - 1];
        System.out.println(sum);
    }

}