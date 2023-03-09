package aufgabe6;

public class Aufgabe6 {

    //    public static void main(String[] args){}

        /**
         * A number divided by two, which doesn't result in a rest of zero
         * is divisible by two
         * @param number dividend
         * @return boolean is number divisible by two
         */

        public static boolean isDivisibleByTwo ( int number){
            if (number % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }

}
