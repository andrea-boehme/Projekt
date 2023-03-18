package aufgabe6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisibleByTwoTest {

    @Test
    public void DivisibleByTwo() {
        assertTrue(DivisibleByTwo.isDivisibleByTwo(2));
        assertTrue(DivisibleByTwo.isDivisibleByTwo(10));
    }
    @Test
    public void NotDivisibleByTwo() {
        assertFalse(DivisibleByTwo.isDivisibleByTwo(3));
    }
}