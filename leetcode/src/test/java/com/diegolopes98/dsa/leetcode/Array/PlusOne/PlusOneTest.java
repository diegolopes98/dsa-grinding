package com.diegolopes98.dsa.leetcode.Array.PlusOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class PlusOneTest {

    private PlusOne solution;

    @BeforeAll
    void setup() {
        solution = new PlusOneImpl();
    }

    @Test
    void givenValidArrayEndingNot9_whenCallingPlusOne_shouldReturnArrayWithIndexChanged() {
        final var givenDigits = new int[]{1, 2, 3, 4};
        final var expectedOutput = new int[]{1, 2, 3, 5};

        final var actualOutput = solution.plusOne(givenDigits);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayEnding9_whenCallingPlusOne_shouldReturnArrayWithIndexChanged() {
        final var givenDigits = new int[]{1, 2, 3, 4, 9};
        final var expectedOutput = new int[]{1, 2, 3, 5, 0};

        final var actualOutput = solution.plusOne(givenDigits);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayEnding99_whenCallingPlusOne_shouldReturnArrayWithIndexChanged() {
        final var givenDigits = new int[]{1, 2, 3, 4, 9, 9};
        final var expectedOutput = new int[]{1, 2, 3, 5, 0, 0};

        final var actualOutput = solution.plusOne(givenDigits);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayWith9_whenCallingPlusOne_shouldReturnArrayWithIndexChanged() {
        final var givenDigits = new int[]{9};
        final var expectedOutput = new int[]{1, 0};

        final var actualOutput = solution.plusOne(givenDigits);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayWith0_whenCallingPlusOne_shouldReturnArrayWithIndexChanged() {
        final var givenDigits = new int[]{0};
        final var expectedOutput = new int[]{1};

        final var actualOutput = solution.plusOne(givenDigits);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenEmptyArray_whenCallingPlusOne_shouldReturnArrayWithIndexChanged() {
        final var givenDigits = new int[]{};
        final var expectedOutput = new int[]{1};

        final var actualOutput = solution.plusOne(givenDigits);

        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}