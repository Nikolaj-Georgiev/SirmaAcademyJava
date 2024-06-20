import java.util.ArrayList;
import java.util.Scanner;

public class StudentsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currentLine = sc.nextLine();
        ArrayList<Students> students = new ArrayList<>();

        while (!currentLine.equals("end")) {
            String[] tokens = currentLine.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String hometown = tokens[3];
            students.add(new Students(firstName, lastName, age, hometown));
            currentLine = sc.nextLine();
        }

        currentLine = sc.nextLine();
        for (Students student : students) {
            if (student.homeTown.equals(currentLine)) {
                System.out.println(STR."\{student.firstName} \{student.lastName} is \{student.age} years old");
            }
        }
    }
}
