package com.diegolopes98.dsa.leetcode.Array.RemoveElement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.util.Arrays;

@TestInstance(Lifecycle.PER_CLASS)
class RemoveElementTest {

    RemoveElement solution;

    @BeforeAll
    void setup() {
        solution = new RemoveElementImpl();
    }

    @Test
    void givenValidArrayWithSize4And2Occurrences_whenCallingRemoveElement_shouldReturn2() {
        final var givenNumbers = new int[]{3, 2, 2, 3};
        final var givenTarget = 3;
        final var expectedOutput = 2;
        final var expectedNumbers = new int[]{2, 2};

        final var actualOutput = solution.removeElement(givenNumbers, givenTarget);
        final var actualNumbers = Arrays.copyOfRange(givenNumbers, 0, expectedOutput);

        Assertions.assertEquals(expectedOutput, actualOutput);
        Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
    }

    @Test
    void givenValidArrayWithSize8And3Occurrences_whenCallingRemoveElement_shouldReturn5() {
        final var givenNumbers = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        final var givenTarget = 2;
        final var expectedOutput = 5;
        final var expectedNumbers = new int[]{0, 1, 3, 0, 4};

        final var actualOutput = solution.removeElement(givenNumbers, givenTarget);
        final var actualNumbers = Arrays.copyOfRange(givenNumbers, 0, expectedOutput);

        Assertions.assertEquals(expectedOutput, actualOutput);
        Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
    }

    @Test
    void givenValidArrayWithSize3And0Occurrences_whenCallingRemoveElement_shouldReturn3() {
        final var givenNumbers = new int[]{0, 1, 2};
        final var givenTarget = 3;
        final var expectedOutput = 3;
        final var expectedNumbers = new int[]{0, 1, 2};

        final var actualOutput = solution.removeElement(givenNumbers, givenTarget);
        final var actualNumbers = Arrays.copyOfRange(givenNumbers, 0, expectedOutput);

        Assertions.assertEquals(expectedOutput, actualOutput);
        Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
    }

    @Test
    void givenValidArrayWithSize0And0Occurrences_whenCallingRemoveElement_shouldReturn0() {
        final var givenNumbers = new int[]{};
        final var givenTarget = 0;
        final var expectedOutput = 0;
        final var expectedNumbers = new int[]{};

        final var actualOutput = solution.removeElement(givenNumbers, givenTarget);
        final var actualNumbers = Arrays.copyOfRange(givenNumbers, 0, expectedOutput);

        Assertions.assertEquals(expectedOutput, actualOutput);
        Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
    }
}