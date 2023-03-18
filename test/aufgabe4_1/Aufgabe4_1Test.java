package aufgabe4_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Aufgabe4_1Test {
    @Test
    public void calculateBmi() {
        double weightInKilograms = 60;
        double heightInCentimeters = 150;

        String Bmi_Result = Aufgabe4_1.calculateBmi(weightInKilograms,heightInCentimeters);
        assertEquals("Normal", Bmi_Result);
    }
}