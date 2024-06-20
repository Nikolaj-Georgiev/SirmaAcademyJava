import java.util.Scanner;

public class ReverseAnArrayOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String intput = sc.nextLine();
        String[] inpArr = intput.split("[, ]+");
        String[] outArr = new String[n];
        for (int j = 0; j < outArr.length; j++) {
            outArr[outArr.length - 1 - j] = inpArr[j];
        }
        for (String str : outArr) {
            System.out.print(str + " ");
        }

    }
}
