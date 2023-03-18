package aufgabe4_3;

import java.util.Scanner;

public class Aufgabe4_3 {

    /**
     * Method (main) to Create an instance of the Scanner class, Take input from the user, Call and store result of method calculateBmi and Print out result
     * @param
     * @param
     * @return
     */
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = sc.nextDouble();
        System.out.print("Input height in meters: ");
        double height = sc.nextDouble();

        double bmi = calculateBmi(weight,height);
        BmiClassification classifiedBmi = classifyBmi(bmi);
        System.out.print("The Body Mass Index is " + bmi + " - classified as: " + classifiedBmi);
    }


    /**
     * Method to calculate the Body Mass Index.0
     * Formula: weight (kg) / (height (meters) * height (meters))
     * @param height - height in centimeters
     * @param weight - weight in kilograms
     * @return Body Mass Index
     */
    public static double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }

    /**
     * Method to classify the Body Mass Index
     * @param bmi calculated by calculatedBmi
     * @return Enum BmiClassification
     */
    public static BmiClassification classifyBmi(double bmi) {

        if (bmi < 18.5) {
            return BmiClassification.UNDERWEIGHT;
        }
        else if (bmi < 25) {
            return BmiClassification.NORMAL;
        }
        else if (bmi < 30) {
            return BmiClassification.OVERWEIGHT;
        }
        else {
            return BmiClassification.OBESE;
        }
    }
}
