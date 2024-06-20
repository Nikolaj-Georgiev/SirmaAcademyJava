import java.util.Arrays;
import java.util.Scanner;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = sc.nextLine().split("[, ]+");
        String[] sortedProducts = Arrays.stream(products).sorted().toArray(String[]::new);
        for (int i = 0; i < sortedProducts.length; i++) {
            System.out.print(STR."\{i + 1}.\{sortedProducts[i]}");
            System.out.println();
        }

    }
}
