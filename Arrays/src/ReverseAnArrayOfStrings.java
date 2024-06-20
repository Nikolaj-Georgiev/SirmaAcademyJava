import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inpArr = input.split("[, ]+");
        String element = "";
        for (int i = 0; i < inpArr.length / 2; i++) {
            element = inpArr[i];
            inpArr[i] = inpArr[inpArr.length - 1 - i];
            inpArr[inpArr.length - 1 - i] = element;
        }
        for (String s : inpArr) {
            System.out.print(s + " ");
        }
    }
    
}
