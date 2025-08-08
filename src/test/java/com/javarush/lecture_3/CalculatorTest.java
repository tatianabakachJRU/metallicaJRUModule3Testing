package com.javarush.lecture_3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Nested;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@ExtendWith(MockitoExtention.class)
public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    public static void beforeAllMethodSetUpCalculator() {
        calculator = new Calculator();
    }

    @BeforeEach
    public void beforeEachTestMethod() {
        System.out.println("Тест начался");
    }

    @Nested
    class AddingTests {
        @Test
        public void shouldReturnSumWhenAddingTwoPositiveNumbers() {
            //Calculator calculator = new Calculator();
            int result = calculator.add(1, 2);
            assertEquals(3, result);
        }

        @Disabled
        @Test
        public void shouldReturnSumWhenAddingTwoNegativeNumbers() {
            //Calculator calculator = new Calculator();
            int result = calculator.add(-1, -2);
            assertEquals(-3, result);
        }
    }


    @Nested
    class SubtractingTests {
        @Test
        @Timeout(value = 1, unit = TimeUnit.SECONDS)
        @Disabled
        public void shouldReturnDifferenceWhenSubstractingTwoPositiveNumbers() {
            //Calculator calculator = new Calculator();
            try{
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int result = calculator.subtract(1, 2);
            assertEquals(-1, result);
        }
    }


    @AfterEach
    public void afterEachTestMethod() {
        System.out.println("Тест окончен");
    }

    @AfterAll
    public static void afterAllMethod() {
        System.out.println("Все Тесты завершены");
    }
}
