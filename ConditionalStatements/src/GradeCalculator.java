import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int percent = Integer.parseInt(sc.nextLine());
        boolean isValid = percent >= 0 && percent <= 100;
        String grade = "";

        if (!isValid) {
            sc.close();
            return;
        }

        if (percent >= 90) {
            grade = "A";
        } else if (percent >= 80) {
            grade = "B";
        } else if (percent >= 70) {
            grade = "C";
        } else if (percent >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(grade);
        sc.close();
    }
}

//A: 90-100%
// B: 80-89%
// C: 70-79%
// D: 60-69%
// F: 0-59%