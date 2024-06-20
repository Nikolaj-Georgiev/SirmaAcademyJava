public class ElectricityBill {
    public static void main(String[] args) {
        int unitsConsumed = 150;
        double ratePerUnit = 1.1;
        double totalBill = (unitsConsumed * ratePerUnit) + 10;
        System.out.println(totalBill);
    }
}

//Calculate the monthly electricity bill based on the number of units consumed and the rate per
//unit. Additionally, a fixed charge of $10 is added to the bill.
//Use the formula
//Total Bill = ( Units consumed × Rate per unit ) + 10

//100
//1.0

//110.00

//200
//1.0

//210.00

//150
//1.1

//175-грешка
//175.0