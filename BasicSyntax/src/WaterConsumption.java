public class WaterConsumption {
    public static void main(String[] args) {
        double weeklyWaterConsumption = 980;
        double peopleInHousehold = 7;
        double waterConsumptionPerPerson = weeklyWaterConsumption / 7 / peopleInHousehold;
        System.out.println(waterConsumptionPerPerson);
    }
}

//Calculate the daily water consumption per person in a household. Given the total water
//consumption in liters for a week and the number of people in the household, find out the daily
//consumption per person.
//Use the formula
//Daily consumption per person = Total weekly consumption / 7 / Number of people

//2450
//7

//50.00 - грешно
// 50.0

//3150
//10

//45.00
//45.0

//980
//7

//20.0