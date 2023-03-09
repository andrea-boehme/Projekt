package aufgabe10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Aufgabe10Test {
    @Test
    public void test() {
        int firstNumber = 4;
        int secondNumber = 6;
        int expectedLcm = 12;

        int resultLcm = Aufgabe10.calculateLcm(firstNumber, secondNumber);

        assertEquals(expectedLcm, resultLcm);
    }
}
