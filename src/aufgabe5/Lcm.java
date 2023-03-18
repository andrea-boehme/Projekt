package aufgabe5;

import java.util.Scanner;

public class Lcm {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = scanner.nextInt();

        int lcm = calculateLcm(firstNumber, secondNumber);

        System.out.printf("The LCM of "+firstNumber+" and "+secondNumber+" is "+lcm);
    }

    public static int calculateLcm(int firstNumber, int secondNumber) {
        int lcm = Math.max(firstNumber, secondNumber);
        int i = 0;
        while (i < 1000000) {
            if (lcm % firstNumber == 0 && lcm % secondNumber == 0) {
                return lcm;
            }
            lcm++;
            i++;
        }
        return -1; // return -1 if no lcm is found after the maximum number of iterations
    }
}

