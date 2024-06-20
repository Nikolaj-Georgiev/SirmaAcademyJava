import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        ArrayList<BankAccount> bankAccounts = new ArrayList<>();

        while (!command.equals("End")) {
            String[] commandLine = command.split("[, ]+");
            String commandType = commandLine.length > 0 ? commandLine[0] : "";
            int id = 0;
            double interestRate = 0;
            if (commandLine.length > 1) {
                if (isInteger(commandLine[1])) {
                    id = Integer.parseInt(commandLine[1]);
                } else {
                    interestRate = Double.parseDouble(commandLine[1]);
                }
            }
            double value = commandLine.length > 2 ? Double.parseDouble(commandLine[2]) : 0;
            switch (commandType) {
                case "Create":
                    bankAccounts.add(new BankAccount());
                    System.out.println(STR."Account ID\{bankAccounts.getLast().getId()} created");
                    break;
                case "Deposit":
                    if (accountExists(bankAccounts, id)) {
                        BankAccount currentAccount = findBankAccountById(bankAccounts, id);
                        currentAccount.deposit(value);
                        System.out.printf(STR."Deposited %.0f to ID\{currentAccount.getId()}", value);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "GetInterest":
                    if (accountExists(bankAccounts, id)) {
                        BankAccount currentAccount = findBankAccountById(bankAccounts, id);
                        double interest = currentAccount.getInterest(value);
                        System.out.printf("%.2f%n", interest);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(interestRate);
                    break;
            }
            command = sc.nextLine();
        }


    }

    public static BankAccount findBankAccountById(ArrayList<BankAccount> bankAccounts, int id) {
        for (BankAccount account : bankAccounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    public static boolean accountExists(ArrayList<BankAccount> bankAccounts, int id) {
        return findBankAccountById(bankAccounts, id) != null;
    }

    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
