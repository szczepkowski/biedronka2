package pl.com.coders.biedronka2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(2,5);

        assertEquals(7, sum);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int subtract = calculator.subtract(7,5);

        assertEquals(2, subtract);
    }
}