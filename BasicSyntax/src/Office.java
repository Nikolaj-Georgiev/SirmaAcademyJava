import java.util.Scanner;

public class Office {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double firstCabinet = Double.parseDouble(sc.nextLine());
        double secondCabinet = firstCabinet * 0.8;
        double thirdCabinet = (firstCabinet + secondCabinet) * 1.15;
        double totalPrice = firstCabinet + secondCabinet + thirdCabinet;
        System.out.printf("%.3f%n", firstCabinet);
        System.out.printf("%.3f%n", secondCabinet);
        System.out.printf("%.3f%n", thirdCabinet);
        System.out.printf("%.3f", totalPrice);
    }
}

//380 1470.600
//720.50 2788.335
//455.30 1762.011