import java.util.Scanner;

public class Numbers1ToNThroughM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int m = Math.abs(Integer.parseInt(sc.nextLine()));

        if(m == 0){
            System.out.println("Please, try different number");
            return;
        }

        for(int i = 1; i <= n; i+=m){
            System.out.println(i);
        }
    }
}
