import java.util.Scanner;

public class AddressByAgeAndGender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();
        String address = "";

        if (age < 16 && age > 0) {
            if (gender.equals("m")) {
                address = "Master";
            } else {
                address = "Miss";
            }
        } else if (age >= 16) {
            if (gender.equals("m")) {
                address = "Mr.";
            } else {
                address = "Ms.";
            }
        }

        System.out.println(address);
        sc.close();
    }
}

//Write a console program that assumes age (real number) and gender ('m' or 'f'), and
//prints a reference among the following:
//• "Mr." — male (sex 'm') 16 years of age or older
//• "Master" – boy (gender 'm') under 16 years
//• "Ms." — woman (sex 'f') 16 years of age or older
//• "Miss" – girl (gender 'f') under 16