package aufgabe8;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

    class Aufgabe8Test {

        @Test

        public void calculateBmi() {

            double weight = 70;
            double height = 1.70;

            double BmiResult = Aufgabe8.calculateBMI(weight, height);
            assertEquals(24.22, BmiResult, 0.01);

        }


    }

