package com.diegolopes98.dsa.leetcode.Array.ConcatenationOfArray;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
class ConcatenationOfArrayTest extends AlgorithmTest<ConcatenationOfArrayInput, int[]> {

    static Stream<Arguments> provideArguments() {
        final var implementation = new ConcatenationOfArrayImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        ConcatenationOfArrayInput.with(new int[]{1, 2, 3}),
                        TestAssertion.expectedOutputConsumer(new int[]{1, 2, 3, 1, 2, 3}, Assertions::assertArrayEquals)
                ), Arguments.of(
                        implementation,
                        ConcatenationOfArrayInput.with(new int[]{1}),
                        TestAssertion.expectedOutputConsumer(new int[]{1, 1}, Assertions::assertArrayEquals)
                ), Arguments.of(
                        implementation,
                        ConcatenationOfArrayInput.with(new int[]{}),
                        TestAssertion.expectedOutputConsumer(new int[]{}, Assertions::assertArrayEquals)
                )
        );
    }
}
