package pl.com.coders.biedronka2;

import org.junit.jupiter.api.Test;
import pl.com.coders.biedronka2.Calculator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(Integer.MAX_VALUE, Integer.MAX_VALUE);

        assertEquals(-2, sum);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int subtract = calculator.subtract(7, 5);

        assertEquals(2, subtract);
    }

    @Test
    void testSum() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1234);
        integers.add(1212312);
        integers.add(123232);

        Calculator calculator = new Calculator();
        int sum = calculator.sum(integers);

        assertEquals(1336778, sum);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        int subtract = calculator.multiply(7, 5);

        assertEquals(35, subtract);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        float subtract = calculator.divide(7, 2);

        assertEquals(3.5, subtract);
    }
}