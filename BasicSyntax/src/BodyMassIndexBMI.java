public class BodyMassIndexBMI {
    public static void main(String[] args) {
        double wight = 70;
        double height = 1.73;
        double bmi = wight / Math.pow(height, 2);
        System.out.printf("%.2f", bmi);
    }
}

//Calculate the Body Mass Index (BMI) based on the given weight (in kilograms) and height (in
//meters).
//Use the formula BMI= Weight / Height2.

//70
//1.73

//23.38
// -грешка 23.39 е вярното

//60
//1.75

//19.59

//85
//1.80

//26.23