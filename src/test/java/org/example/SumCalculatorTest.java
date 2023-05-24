package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    private final SumCalculator calculator = new SumCalculator();
    private static final List<Integer> NUMS = List.of(11, 1, 2, 3, -9, 10, 4, -8, -6, 6, -7);
    private static final List<Integer> ONLY_POS_NUMS = List.of(11, 1, 2, 3, 9, 10, 4, 8, 6, 6, 7);
    private static final List<Integer> ONLY_NEG_NUMS = List.of(-11, -1, -2, -3, -9, -10, -4, -8, -6, -6, -7);

    @Test
    @DisplayName("Testing method getPositiveSum should return 37")
    void getPositiveSum_ShouldReturn37() {
        assertEquals(37, calculator.getPositiveSum(NUMS));
    }

    @Test
    @DisplayName("Testing method getPositiveSum with only positive numbers should return 67")
    void getPositiveSum_ShouldReturn67() {
        assertEquals(67, calculator.getPositiveSum(ONLY_POS_NUMS));
    }

    @Test
    @DisplayName("Testing method getPositiveSum with only negative numbers should return 0")
    void getPositiveSum_ShouldReturn0() {
        assertEquals(0, calculator.getPositiveSum(ONLY_NEG_NUMS));
    }

    @Test
    @DisplayName("Testing method getNegative should return -30")
    void getNegativeSum_ShouldReturnMinus30() {
        assertEquals(-30, calculator.getNegativeSum(NUMS));
    }

    @Test
    @DisplayName("Testing method getNegative with only positive numbers should return 0")
    void getNegativeSum_ShouldReturnMinus0() {
        assertEquals(0, calculator.getNegativeSum(ONLY_POS_NUMS));
    }

    @Test
    @DisplayName("Testing method getNegative with only negative numbers should return -67")
    void getNegativeSum_ShouldReturnMinus67() {
        assertEquals(-67, calculator.getNegativeSum(ONLY_NEG_NUMS));
    }
}