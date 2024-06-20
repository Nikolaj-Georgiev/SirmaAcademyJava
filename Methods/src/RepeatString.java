import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        int nTimes = Integer.parseInt(sc.nextLine());
        System.out.println(repeatString(string, nTimes));
    }

    public static String repeatString(String str, int times) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += str;
        }
        return result;
    }
}
