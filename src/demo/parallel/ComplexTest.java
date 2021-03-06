package demo.parallel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testAdd() {
        Complex a = new Complex(5, 38);
        Complex b = new Complex(4, 28);
        a.plus(b);
        assertEquals(a.getRe(), 10, "Operation plus failed. Expected 4");
        assertEquals(a.getIm(), 66, "Operation plus failed. Expected 66");
    }

    @Test
    public void testMinus() {
        Complex a = new Complex(6, 8);
        Complex b = new Complex(10, 4);
        a.minus(b);
        assertEquals(a.getRe(), -4, "Operation minus failed. Expected -4");
        assertEquals(a.getIm(), 4, "Operation minus failed. Expected 4");
    }

    @Test
    public void testTimes() {
        Complex a = new Complex(6, 8);
        Complex b = new Complex(10, 4);
        a.times(b);
        assertEquals(a.getRe(), 28, "Operation time failed. Expected 28");
        assertEquals(a.getIm(), 104, "Operation time failed. Expected 104");
    }
}