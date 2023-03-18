package aufgabe4_1;

import java.util.Scanner;

public class Aufgabe4_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter weight in kg");
        double weightInKilograms = scanner.nextDouble();
        System.out.println("Please enter height in m");
        double heightInCentimeters = scanner.nextDouble();

        String Bmi = calculateBmi(weightInKilograms, heightInCentimeters);
        System.out.println("Bmi: " + Bmi);
    }

        public static String calculateBmi ( double weightInKilograms, double heightInCentimeters) {
            double Bmi = (weightInKilograms) / (heightInCentimeters * heightInCentimeters);
            if (Bmi < 18.5) {
                return "Untergewichtig";
            } else if (Bmi < 25) {
                return "Normalgewichtig";
            } else if (Bmi < 30) {
                return "Übergewichtig";
            } else {
                return "Schweres Übergewicht";
            }

        }
}
