package aufgabe6;

public class Aufgabe6 {

        /**
         * A number divided by two, which doesn't result in a rest of zero
         * is divisable by two.2
         * @param number dividend
         * @return boolean is number diivisable by two
         */

        public static boolean isDivisibleByTwo(int number) {
            if (number % 2 == 0){
                return true;
            } else {
                return false;
            }
        }
}
