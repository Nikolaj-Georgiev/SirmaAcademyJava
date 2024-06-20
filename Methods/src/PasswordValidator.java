import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        boolean isValidPassword = validatePassword(password);

        if (isValidPassword) {
            System.out.println("Password is valid");
        }
        
    }

    public static boolean validatePassword(String password) {
        boolean valid = true;
        String regex = "^[a-zA-Z0-9]+$";
        int digitCount = 0;
        if (password.length() < 6 || password.length() > 10) {
            valid = false;
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!password.matches(regex)) {
            valid = false;
            System.out.println("Password must contain only letters and digits");
        }

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        if (digitCount < 2) {
            valid = false;
            System.out.println("Password must contain at least 2 digits");
        }

        return valid;

    }
}
