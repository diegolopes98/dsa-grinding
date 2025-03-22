package com.diegolopes98.dsa.leetcode.Array.MergeSortedArray;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MergeSortedArrayTest {

    private MergeSortedArray solution;

    @BeforeAll
    void setup() {
        solution = new MergeSortedArrayImpl();
    }

    @Test
    void givenValidInputs1_whenCallingMerge_shouldReturnArrayMerged() {
        final var givenNums1 = new int[]{1, 2, 3, 0, 0, 0};
        final var givenM = 3;
        final var givenNums2 = new int[]{2, 5, 6};
        final var givenN = 3;
        final var expectedOutput = new int[]{1, 2, 2, 3, 5, 6};

        solution.merge(givenNums1, givenM, givenNums2, givenN);

        Assertions.assertArrayEquals(expectedOutput, givenNums1);
    }

    @Test
    void givenValidInputs2_whenCallingMerge_shouldReturnArrayMerged() {
        final var givenNums1 = new int[]{1};
        final var givenM = 1;
        final var givenNums2 = new int[]{};
        final var givenN = 0;
        final var expectedOutput = new int[]{1};

        solution.merge(givenNums1, givenM, givenNums2, givenN);

        Assertions.assertArrayEquals(expectedOutput, givenNums1);
    }

    @Test
    void givenValidInputs3_whenCallingMerge_shouldReturnArrayMerged() {
        final var givenNums1 = new int[]{0};
        final var givenM = 0;
        final var givenNums2 = new int[]{1};
        final var givenN = 1;
        final var expectedOutput = new int[]{1};

        solution.merge(givenNums1, givenM, givenNums2, givenN);

        Assertions.assertArrayEquals(expectedOutput, givenNums1);
    }

}