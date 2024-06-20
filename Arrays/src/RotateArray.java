import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inpArr = sc.nextLine().split("[, ]+");
        int rotations = Integer.parseInt(sc.nextLine());
        if (rotations == inpArr.length || rotations % inpArr.length == 0) {
            for (String s : inpArr) {
                System.out.print(STR."\{s} ");
            }
            return;
        }
        int actualRotations = rotations % inpArr.length;
        for (int i = 0; i < actualRotations; i++) {
            String[] tempArr = new String[inpArr.length +1];
            System.arraycopy(inpArr, 0, tempArr, 1, inpArr.length);
            tempArr[0] = inpArr[inpArr.length - 1];
            System.arraycopy(tempArr, 0, inpArr, 0, tempArr.length - 1);
        }
        for (String s : inpArr) {
            System.out.print(STR."\{s} ");
        }
    }
}
