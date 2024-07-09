package GenericBox;

import java.util.Scanner;

public class TestInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            Box<Integer> box = new Box<>(num);
            output.append(box.toString());
            if (i < n - 1) {
                output.append("\n");
            }
        }
        System.out.println(output);
        sc.close();
    }
}
