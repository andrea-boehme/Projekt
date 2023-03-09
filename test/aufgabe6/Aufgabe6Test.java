package aufgabe6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Aufgabe6Test {

    @Test
    public void DivisibleByTwo() {
        assertTrue(Aufgabe6.isDivisibleByTwo(2));
        assertTrue(Aufgabe6.isDivisibleByTwo(10));
    }
    @Test
    public void NotDivisibleByTwo() {
        assertFalse(Aufgabe6.isDivisibleByTwo(3));
    }
}