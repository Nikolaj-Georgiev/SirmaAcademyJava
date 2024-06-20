import java.util.Scanner;

public class UniversityAdmissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = Integer.parseInt(sc.nextLine());
        int activities = Integer.parseInt(sc.nextLine());

        if (score >= 90 || (score >= 80 && activities >= 2)) {
            System.out.println("Admitted");
        } else {
            System.out.println("Not Admitted");
        }

        sc.close();
    }
}
