import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String nStr = String.valueOf(n);
        int length = nStr.length();
        String output = "Armstrong";
        int sum = 0;

        for (int i = 0; i < nStr.length(); i++) {
            int currentDigit = Integer.parseInt(String.valueOf(nStr.charAt(i)));
            sum += (int) Math.pow(currentDigit, length);
        }

        if (sum != n){
            output = "Not Armstrong";
        }

        System.out.println(output);
    }
}
