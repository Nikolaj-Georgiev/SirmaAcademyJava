import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(sc.nextLine()));
        String nStr = String.valueOf(n);
        String reversN = "";

        for(int i = nStr.length() - 1; i >= 0; i--){
            reversN = reversN + nStr.charAt(i);
        }
        System.out.println(reversN);

    }
}
