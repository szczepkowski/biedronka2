package pl.com.coders.biedronka2;

import java.util.List;

public class Calculator {

    private int value = 0;

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(float a, float b) {
        return a / b;
    }


    public int sum(List<Integer> list) {

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            sum = sum + integer;
        }

        return sum;
    }

    public long fib(int x) {
        int number1 = 1;
        int number2 = 1;

        int fib = 0;

        for (int i = 1; i < x; i++) {

            fib = number1 + number2;
            number2 = number1;
            number1 = fib;
        }

        return fib;
    }
}
