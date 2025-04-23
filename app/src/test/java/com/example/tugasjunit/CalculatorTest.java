package com.example.tugasjunit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit tests for Calculator class
 */
public class CalculatorTest {
    private com.example.simplecalculator.Calculator calculator;

    @Before
    public void setUp() {
        calculator = new com.example.simplecalculator.Calculator();
    }

    /**
     * Test case untuk menguji fungsi add() dengan input positif
     * Menguji apakah fungsi add() dapat menjumlahkan dua bilangan positif dengan benar
     * Input: 5 dan 7
     * Expected output: 12
     */
    @Test
    public void add_PositiveNumbers_ReturnsCorrectSum() {
        // Arrange
        int a = 5;
        int b = 7;
        int expected = 12;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(expected, result);
    }

    /**
     * Test case untuk menguji fungsi add() dengan input negatif
     * Menguji apakah fungsi add() dapat menjumlahkan bilangan negatif dengan benar
     * Input: -3 dan -8
     * Expected output: -11
     */
    @Test
    public void add_NegativeNumbers_ReturnsCorrectSum() {
        // Arrange
        int a = -3;
        int b = -8;
        int expected = -11;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(expected, result);
    }

    /**
     * Test case untuk menguji fungsi subtract() dengan input positif
     * Menguji apakah fungsi subtract() dapat mengurangkan dua bilangan positif dengan benar
     * Input: 10 dan 4
     * Expected output: 6
     */
    @Test
    public void subtract_PositiveNumbers_ReturnsCorrectDifference() {
        // Arrange
        int a = 10;
        int b = 4;
        int expected = 6;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(expected, result);
    }

    /**
     * Test case untuk menguji fungsi subtract() dengan hasil negatif
     * Menguji apakah fungsi subtract() menghasilkan nilai negatif dengan benar
     * Input: 5 dan 10
     * Expected output: -5
     */
    @Test
    public void subtract_ResultNegative_ReturnsNegativeDifference() {
        // Arrange
        int a = 5;
        int b = 10;
        int expected = -5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(expected, result);
    }
}