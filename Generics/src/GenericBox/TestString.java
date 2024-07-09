package GenericBox;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        StringBuilder output = new StringBuilder();
        while (n-- > 0) {
            String s = sc.nextLine();
            Box<String> box = new Box<>(s);
            output.append(box.toString());
            if (n > 0) {
                output.append("\n");
            }
        }
        System.out.println(output);
        sc.close();
    }
}
