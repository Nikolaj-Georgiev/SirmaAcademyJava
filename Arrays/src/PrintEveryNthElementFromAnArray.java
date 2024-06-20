import java.util.Scanner;

public class PrintEveryNthElementFromAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputArr = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = inputArr.split("[, ]+");
        String[] newArr = new String[Math.round((float) arr.length / n)];
        int counter = 0;
        for (int i = 0; i < arr.length; i += n) {
            newArr[counter] = arr[i];
            counter++;
        }
        System.out.println(String.join(" ", newArr));

    }
}
