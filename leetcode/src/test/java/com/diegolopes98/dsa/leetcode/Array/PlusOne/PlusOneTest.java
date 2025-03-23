package com.diegolopes98.dsa.leetcode.Array.PlusOne;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
class PlusOneTest extends AlgorithmTest<PlusOneInput, int[]> {

    static Stream<Arguments> provideArguments() {
        final var implementation = new PlusOneImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        PlusOneInput.with(new int[]{1, 2, 3, 4}),
                        TestAssertion.expectedOutputConsumer(new int[]{1, 2, 3, 5}, Assertions::assertArrayEquals)
                ), Arguments.of(
                        implementation,
                        PlusOneInput.with(new int[]{1, 2, 3, 4, 9}),
                        TestAssertion.expectedOutputConsumer(new int[]{1, 2, 3, 5, 0}, Assertions::assertArrayEquals)
                ), Arguments.of(
                        implementation,
                        PlusOneInput.with(new int[]{1, 2, 3, 4, 9, 9}),
                        TestAssertion.expectedOutputConsumer(new int[]{1, 2, 3, 5, 0, 0}, Assertions::assertArrayEquals)
                ), Arguments.of(
                        implementation,
                        PlusOneInput.with(new int[]{9}),
                        TestAssertion.expectedOutputConsumer(new int[]{1, 0}, Assertions::assertArrayEquals)
                ), Arguments.of(
                        implementation,
                        PlusOneInput.with(new int[]{0}),
                        TestAssertion.expectedOutputConsumer(new int[]{1}, Assertions::assertArrayEquals)
                ), Arguments.of(
                        implementation,
                        PlusOneInput.with(new int[]{}),
                        TestAssertion.expectedOutputConsumer(new int[]{1}, Assertions::assertArrayEquals)
                )
        );
    }
}