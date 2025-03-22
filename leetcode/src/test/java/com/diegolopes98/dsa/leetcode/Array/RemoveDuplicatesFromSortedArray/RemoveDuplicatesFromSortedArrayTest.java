package com.diegolopes98.dsa.leetcode.Array.RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.util.Arrays;

@TestInstance(Lifecycle.PER_CLASS)
class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray solution;

    @BeforeAll
    void setup() {
        solution = new RemoveDuplicatesFromSortedArrayImpl();
    }

    @Test
    void givenValidArrayWith1DuplicateAnd3Elements_whenCallingRemoveDuplicates_shouldReturn2() {
        final var givenNumbers = new int[]{1, 1, 2};
        final var expectedOutput = 2;
        final var expectedNumbers = new int[]{1, 2};

        final var actualOutput = solution.removeDuplicates(givenNumbers);
        final var actualNumbers = Arrays.copyOfRange(givenNumbers, 0, expectedOutput);

        Assertions.assertEquals(expectedOutput, actualOutput);
        Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
    }

    @Test
    void givenValidArrayWith5DuplicateAnd10Elements_whenCallingRemoveDuplicates_shouldReturn2() {
        final var givenNumbers = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        final var expectedOutput = 5;
        final var expectedNumbers = new int[]{0, 1, 2, 3, 4};

        final var actualOutput = solution.removeDuplicates(givenNumbers);
        final var actualNumbers = Arrays.copyOfRange(givenNumbers, 0, expectedOutput);

        Assertions.assertEquals(expectedOutput, actualOutput);
        Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
    }

}