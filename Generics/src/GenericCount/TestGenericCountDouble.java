package GenericCount;

import java.util.Scanner;

public class TestGenericCountDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        GenericList<Double> list = new GenericList<>();
        System.out.println();
        while (n-- > 0) {
            double d = Double.parseDouble(sc.nextLine());
            list.add(d);
        }
        double comparator = Double.parseDouble(sc.nextLine());
        sc.close();
        System.out.println(list.countHeavier(comparator));
    }
}
