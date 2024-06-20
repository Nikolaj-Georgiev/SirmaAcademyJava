public class BankAccount {
    private static int idCounter = 1;
    private static double interestRate = 0.02;
    private int id;
    private double balance;

    public BankAccount() {
        this.id = idCounter++;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(double Years) {
        return interestRate * Years * this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) this.balance += amount;
    }


    public int getId() {
        return id;
    }
}
