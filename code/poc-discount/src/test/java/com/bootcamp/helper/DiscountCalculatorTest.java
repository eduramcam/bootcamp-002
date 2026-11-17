package com.bootcamp.helper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {

    private static final double DELTA = 0.0001;

    private DiscountCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new DiscountCalculator();
    }

    @Test
    void shouldCalculatePercentageDiscount() {
        double discount = calculator.calculatePercentageDiscount(200.0, 15.0);

        assertEquals(30.0, discount, DELTA);
    }

    @Test
    void shouldCalculateFullPercentageDiscount() {
        double discount = calculator.calculatePercentageDiscount(200.0, 100.0);

        assertEquals(200.0, discount, DELTA);
    }

    @Test
    void shouldLimitPercentageDiscountToProductPrice() {
        double discount = calculator.calculatePercentageDiscount(200.0, 150.0);

        assertEquals(200.0, discount, DELTA);
    }

    @Test
    void shouldReturnZeroForZeroOrNegativePercentageDiscount() {
        assertEquals(0.0, calculator.calculatePercentageDiscount(200.0, 0.0), DELTA);
        assertEquals(0.0, calculator.calculatePercentageDiscount(200.0, -10.0), DELTA);
    }

    @Test
    void shouldReturnZeroPercentageDiscountForZeroOrNegativePrice() {
        assertEquals(0.0, calculator.calculatePercentageDiscount(0.0, 20.0), DELTA);
        assertEquals(0.0, calculator.calculatePercentageDiscount(-200.0, 20.0), DELTA);
    }

    @Test
    void shouldCalculateDirectDiscount() {
        double discount = calculator.calculateDirectDiscount(200.0, 45.0);

        assertEquals(45.0, discount, DELTA);
    }

    @Test
    void shouldCalculateDirectDiscountEqualToProductPrice() {
        double discount = calculator.calculateDirectDiscount(200.0, 200.0);

        assertEquals(200.0, discount, DELTA);
    }

    @Test
    void shouldLimitDirectDiscountToProductPrice() {
        double discount = calculator.calculateDirectDiscount(200.0, 250.0);

        assertEquals(200.0, discount, DELTA);
    }

    @Test
    void shouldReturnZeroForZeroOrNegativeDirectDiscount() {
        assertEquals(0.0, calculator.calculateDirectDiscount(200.0, 0.0), DELTA);
        assertEquals(0.0, calculator.calculateDirectDiscount(200.0, -45.0), DELTA);
    }

    @Test
    void shouldReturnZeroDirectDiscountForZeroOrNegativePrice() {
        assertEquals(0.0, calculator.calculateDirectDiscount(0.0, 45.0), DELTA);
        assertEquals(0.0, calculator.calculateDirectDiscount(-200.0, 45.0), DELTA);
    }
}
