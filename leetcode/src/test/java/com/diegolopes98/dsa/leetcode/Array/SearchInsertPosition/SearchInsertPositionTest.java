package com.diegolopes98.dsa.leetcode.Array.SearchInsertPosition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class SearchInsertPositionTest {

    private SearchInsertPosition solution;

    @BeforeAll
    void setup() {
        solution = new SearchInsertPositionImpl();
    }

    @Test
    void givenValidArrayOf5IncludingTargetAtMid_whenCallingSearchInsert_shouldReturnCorrectly() {
        final var givenNums = new int[]{1, 3, 4, 5, 6};
        final var givenTarget = 4;
        final var expectedOutput = 2;

        final var actualOutput = solution.searchInsert(givenNums, givenTarget);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayOf5IncludingTargetAtStart_whenCallingSearchInsert_shouldReturnCorrectly() {
        final var givenNums = new int[]{1, 3, 4, 5, 6};
        final var givenTarget = 1;
        final var expectedOutput = 0;

        final var actualOutput = solution.searchInsert(givenNums, givenTarget);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayOf5IncludingTargetAtEnd_whenCallingSearchInsert_shouldReturnCorrectly() {
        final var givenNums = new int[]{1, 3, 4, 5, 6};
        final var givenTarget = 6;
        final var expectedOutput = 4;

        final var actualOutput = solution.searchInsert(givenNums, givenTarget);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayOf5NotIncludingTargetAtMid_whenCallingSearchInsert_shouldReturnCorrectly() {
        final var givenNums = new int[]{1, 3, 4, 5, 6};
        final var givenTarget = 4;
        final var expectedOutput = 2;

        final var actualOutput = solution.searchInsert(givenNums, givenTarget);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayOf5NotIncludingTargetAtStart_whenCallingSearchInsert_shouldReturnCorrectly() {
        final var givenNums = new int[]{2, 3, 4, 5, 6};
        final var givenTarget = 1;
        final var expectedOutput = 0;

        final var actualOutput = solution.searchInsert(givenNums, givenTarget);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayOf5NotIncludingTargetAtEnd_whenCallingSearchInsert_shouldReturnCorrectly() {
        final var givenNums = new int[]{1, 2, 3, 4, 5};
        final var givenTarget = 6;
        final var expectedOutput = 4;

        final var actualOutput = solution.searchInsert(givenNums, givenTarget);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayOf4NotIncludingTargetAtIndex1_whenCallingSearchInsert_shouldReturnCorrectly() {
        final var givenNums = new int[]{1, 3, 5, 6};
        final var givenTarget = 2;
        final var expectedOutput = 1;

        final var actualOutput = solution.searchInsert(givenNums, givenTarget);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenValidArrayOf4NotIncludingTargetAtIndex4_whenCallingSearchInsert_shouldReturnCorrectly() {
        final var givenNums = new int[]{1, 3, 5, 6};
        final var givenTarget = 7;
        final var expectedOutput = 4;

        final var actualOutput = solution.searchInsert(givenNums, givenTarget);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}