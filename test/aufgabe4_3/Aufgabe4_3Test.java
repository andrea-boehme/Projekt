package aufgabe4_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Aufgabe4_3Test {
    @Test
    public void whenBMIIsGreaterThanThirty_thenObese() {
        BmiClassification actual = Aufgabe4_3.classifyBmi(50);
        BmiClassification expected = BmiClassification.OBESE;

        assertEquals(expected, actual);
    }

    @Test
    public void whenBMIIsGreaterThanTwentyFife_thenOverweight() {
        BmiClassification actual = Aufgabe4_3.classifyBmi(28);
        BmiClassification expected = BmiClassification.OVERWEIGHT;

        assertEquals(expected, actual);
    }

    @Test
    public void whenBMIIsGreaterThanTwentyFife_thenNormal() {
        BmiClassification actual = Aufgabe4_3.classifyBmi(22);
        BmiClassification expected = BmiClassification.NORMAL;

        assertEquals(expected, actual);
    }

    @Test
    public void whenBMIIsGreaterThanTwentyFife_thenUnderweight() {
        BmiClassification actual = Aufgabe4_3.classifyBmi(14);
        BmiClassification expected = BmiClassification.UNDERWEIGHT;

        assertEquals(expected, actual);
    }

}
