public class Calculate {
    public static void main(String[] args) {
        int numOne = 3;
        int numTwo = 46;
        int sum = numOne + numTwo;
        int diff = Math.abs(numOne - numTwo);
        int multiple = numOne * numTwo;
        double average = (numOne + numTwo) / 2.0;
        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + diff);
        System.out.println("The product is: " + multiple);
        System.out.printf("The average is: %f", average);
//25
//5
//The sum is: 30
//The difference is: 20
//The product is: 125
//The average is: 15.000000
//7
//2
//The sum is: 9
//The difference is: 5
//The product is: 14
//The average is: 4.500000
//26158
//19
//The sum is: 26177
//The difference is: 26139
//The product is: 497002
//The average is: 13088.500000
//3
//46
//The sum is: 49
//The difference is: 43
//The product is: 138
//The sum is: 24 - грешка
//        вярното е 24.500000
    }
}
