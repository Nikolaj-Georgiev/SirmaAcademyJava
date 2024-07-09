package GenericCount;

import java.util.Scanner;

public class TestGenericCountSting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GenericList<String> list = new GenericList<>();
        while (n-- > 0) {
            String s = sc.nextLine();
            list.add(s);
        }
        String comparator = sc.nextLine();
        sc.close();
        System.out.println(list.countHeavier(comparator));
    }
}
