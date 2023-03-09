package aufgabe7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Aufgabe7Test {
    @Test
    public void calculateBmi() {
        double weightInKilograms = 60;
        double heightInCentimeters = 150;

        String Bmi_Result = Aufgabe7.calculateBmi(weightInKilograms,heightInCentimeters);
        assertEquals("Normal", Bmi_Result);
    }
}