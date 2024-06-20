import java.util.Scanner;

public class ReadDifferentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char first = (sc.nextLine().charAt(0));
        int num = Integer.parseInt(sc.nextLine());
        double realNum = Double.parseDouble(sc.nextLine());
        System.out.println(text);
        System.out.println(first);
        System.out.println(num);
        System.out.println(realNum);
    }
}
