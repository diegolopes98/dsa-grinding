package com.diegolopes98.dsa.leetcode.Array.RemoveElement;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
class RemoveElementTest extends AlgorithmTest<RemoveElementInput, Integer> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new RemoveElementImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        RemoveElementInput.with(new int[]{3, 2, 2, 3}, 3),
                        TestAssertion.<RemoveElementInput, Integer>inputOutputConsumer((givenInput, actualOutput) -> {
                            final var expectedOutput = 2;
                            final var expectedNumbers = new int[]{2, 2};
                            final var actualNumbers = Arrays.copyOfRange(givenInput.nums(), 0, expectedOutput);

                            Assertions.assertEquals(expectedOutput, actualOutput);
                            Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
                        })
                ), Arguments.of(
                        implementation,
                        RemoveElementInput.with(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2),
                        TestAssertion.<RemoveElementInput, Integer>inputOutputConsumer((givenInput, actualOutput) -> {
                            final var expectedOutput = 5;
                            final var expectedNumbers = new int[]{0, 1, 3, 0, 4};
                            final var actualNumbers = Arrays.copyOfRange(givenInput.nums(), 0, expectedOutput);

                            Assertions.assertEquals(expectedOutput, actualOutput);
                            Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
                        })
                ), Arguments.of(
                        implementation,
                        RemoveElementInput.with(new int[]{0, 1, 2}, 3),
                        TestAssertion.<RemoveElementInput, Integer>inputOutputConsumer((givenInput, actualOutput) -> {
                            final var expectedOutput = 3;
                            final var expectedNumbers = new int[]{0, 1, 2};
                            final var actualNumbers = Arrays.copyOfRange(givenInput.nums(), 0, expectedOutput);

                            Assertions.assertEquals(expectedOutput, actualOutput);
                            Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
                        })
                ), Arguments.of(
                        implementation,
                        RemoveElementInput.with(new int[]{}, 0),
                        TestAssertion.<RemoveElementInput, Integer>inputOutputConsumer((givenInput, actualOutput) -> {
                            final var expectedOutput = 0;
                            final var expectedNumbers = new int[]{};
                            final var actualNumbers = Arrays.copyOfRange(givenInput.nums(), 0, expectedOutput);

                            Assertions.assertEquals(expectedOutput, actualOutput);
                            Assertions.assertArrayEquals(expectedNumbers, actualNumbers);
                        })
                )
        );
    }
}
