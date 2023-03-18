package aufgabe3;

import java.util.Scanner;

public class DivisibleByTwo {

    private static final Integer DIVISOR = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int number = scanner.nextInt();

        Boolean result= isDivisibleByTwo(number);
        System.out.println("Divisible by two: " + result);
    }

        /**
         * A number divided by two, which doesn't result in a rest of zero
         * is divisible by two
         * @param number dividend
         * @return boolean is number divisible by two
         */

        public static boolean isDivisibleByTwo ( int number){
            if (number % DIVISOR == 0) {
                return true;
            } else {
                return false;
            }
        }

}
