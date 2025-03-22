package com.diegolopes98.dsa.neetcode.ArraysAndHashing.TopKFrequentElements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class TopKFrequentElementsTest {

    private TopKFrequentElements solution;

    @BeforeAll
    void setup() {
        solution = new TopKFrequentElementsNaiveImpl();
    }

    @Test
    void givenValidArrayConsecutiveAndLimit2_whenCallingTopKFrequent_shouldReturnTheTopKValues() {
        final var givenNums = new int[]{1, 2, 2, 3, 3, 3};
        final var givenK = 2;
        final var expectedOutput = new int[]{3, 2};

        final var actualOutput = solution.topKFrequent(givenNums, givenK);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayEqualValuesAndLimit1_whenCallingTopKFrequent_shouldReturnTheTopKValues() {
        final var givenNums = new int[]{7, 7};
        final var givenK = 1;
        final var expectedOutput = new int[]{7};

        final var actualOutput = solution.topKFrequent(givenNums, givenK);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

}