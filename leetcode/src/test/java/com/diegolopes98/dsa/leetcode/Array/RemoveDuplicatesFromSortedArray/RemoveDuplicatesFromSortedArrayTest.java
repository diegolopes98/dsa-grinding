package com.diegolopes98.dsa.leetcode.Array.RemoveDuplicatesFromSortedArray;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
class RemoveDuplicatesFromSortedArrayTest extends AlgorithmTest<RemoveDuplicatesFromSortedArrayInput, Integer> {

    static Stream<Arguments> provideArguments() {
        final var implementation = new RemoveDuplicatesFromSortedArrayImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        RemoveDuplicatesFromSortedArrayInput.with(new int[]{1, 1, 2}),
                        TestAssertion.<RemoveDuplicatesFromSortedArrayInput, Integer>inputOutputConsumer(
                                (givenInput, actualOutput) -> {
                                    final var expectedOutput = 2;
                                    final var expectedNumbers = new int[]{1, 2};
                                    final var actualNumbers = Arrays.copyOfRange(givenInput.nums(), 0, expectedOutput);

                                    Assertions.assertEquals(expectedOutput, actualOutput);
                                    Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
                                }
                        )
                ), Arguments.of(
                        implementation,
                        RemoveDuplicatesFromSortedArrayInput.with(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}),
                        TestAssertion.<RemoveDuplicatesFromSortedArrayInput, Integer>inputOutputConsumer(
                                (givenInput, actualOutput) -> {
                                    final var expectedOutput = 5;
                                    final var expectedNumbers = new int[]{0, 1, 2, 3, 4};
                                    final var actualNumbers = Arrays.copyOfRange(givenInput.nums(), 0, expectedOutput);

                                    Assertions.assertEquals(expectedOutput, actualOutput);
                                    Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
                                }
                        )
                ), Arguments.of(
                        implementation,
                        RemoveDuplicatesFromSortedArrayInput.with(new int[]{}),
                        TestAssertion.<RemoveDuplicatesFromSortedArrayInput, Integer>inputOutputConsumer(
                                (givenInput, actualOutput) -> {
                                    final var expectedOutput = 0;
                                    final var expectedNumbers = new int[]{};
                                    final var actualNumbers = Arrays.copyOfRange(givenInput.nums(), 0, expectedOutput);

                                    Assertions.assertEquals(expectedOutput, actualOutput);
                                    Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
                                }
                        )
                )
        );
    }
}