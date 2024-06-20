import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text);
        sc.close();
    }
}
