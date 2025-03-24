package com.diegolopes98.dsa.leetcode.Array.MergeSortedArray;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
class MergeSortedArrayTest extends AlgorithmTest<MergeSortedArrayInput, Void> {

    static Stream<Arguments> provideArguments() {
        final var implementation = new MergeSortedArrayImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        MergeSortedArrayInput.with(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3),
                        TestAssertion.<MergeSortedArrayInput>inputConsumer(givenInput -> {
                            final var expectedOutput = new int[]{1, 2, 2, 3, 5, 6};
                            Assertions.assertArrayEquals(expectedOutput, givenInput.nums1());
                        })
                ), Arguments.of(
                        implementation,
                        MergeSortedArrayInput.with(new int[]{1}, 0, new int[]{}, 0),
                        TestAssertion.<MergeSortedArrayInput>inputConsumer(givenInput -> {
                            final var expectedOutput = new int[]{1};
                            Assertions.assertArrayEquals(expectedOutput, givenInput.nums1());
                        })
                ), Arguments.of(
                        implementation,
                        MergeSortedArrayInput.with(new int[]{0}, 0, new int[]{1}, 1),
                        TestAssertion.<MergeSortedArrayInput>inputConsumer(givenInput -> {
                            final var expectedOutput = new int[]{1};
                            Assertions.assertArrayEquals(expectedOutput, givenInput.nums1());
                        })
                )
        );
    }
}