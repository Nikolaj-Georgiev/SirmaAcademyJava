import java.util.Scanner;

public class AddAndRemoveElementsFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inpArr = input.split("[, ]+");
        int n = inpArr.length;
        int[] resultArr = new int[1];
        resultArr[0] = 1;
        int counter = 1;
        boolean isEmpty = false;
        for (int i = 1; i < n; i++) {
            if (inpArr[i].equals("add")) {
                int[] tempArr = new int[resultArr.length + 1];
                System.arraycopy(resultArr, 0, tempArr, 0, resultArr.length);
                counter++;
                tempArr[tempArr.length - 1] = counter;
                resultArr = tempArr;
            } else  {
                if (resultArr.length < 1){
                    System.out.println("Empty");
                    isEmpty = true;
                    break;
                }
                int[] tempArr = new int[resultArr.length - 1];
                System.arraycopy(resultArr, 0, tempArr, 0, resultArr.length -1);
                resultArr = tempArr;
                counter++;
            }
        }
        if (!isEmpty) {
            for (int i : resultArr) {
                System.out.print(STR."\{i} ");
            }
        }
    }
}
