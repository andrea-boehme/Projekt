package aufgabe4_2;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

    class Aufgabe4_2Test {

        @Test

        public void calculateBmi() {

            double weight = 70;
            double height = 1.70;

            double BmiResult = Aufgabe4_2.calculateBMI(weight, height);
            assertEquals(24.22, BmiResult, 0.01);

        }


    }

