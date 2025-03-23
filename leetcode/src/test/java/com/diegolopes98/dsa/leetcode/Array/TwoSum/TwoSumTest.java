package com.diegolopes98.dsa.leetcode.Array.TwoSum;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class TwoSumTest extends AlgorithmTest<TwoSumInput, int[]> {
    static Stream<Arguments> provideArguments() {
        final var hashMapTwoPassImplementation = new TwoSumHashMapTwoPassImpl();
        final var hashMapOnePassImplementation = new TwoSumHashMapOnePassImpl();

        return Stream.of(
                Arguments.of(
                        hashMapTwoPassImplementation,
                        TwoSumInput.with(new int[]{-1, 0, 1, 2, 3, 4, 5}, -1),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{0, 1};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        hashMapOnePassImplementation,
                        TwoSumInput.with(new int[]{-1, 0, 1, 2, 3, 4, 5}, -1),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{0, 1};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        hashMapTwoPassImplementation,
                        TwoSumInput.with(new int[]{-1, 0, 1, 2, 3, 4, 5}, 9),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{5, 6};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        hashMapOnePassImplementation,
                        TwoSumInput.with(new int[]{-1, 0, 1, 2, 3, 4, 5}, 9),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{5, 6};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        hashMapTwoPassImplementation,
                        TwoSumInput.with(new int[]{-1, 2, 3, 5}, 5),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{1, 2};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        hashMapOnePassImplementation,
                        TwoSumInput.with(new int[]{-1, 2, 3, 5}, 5),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{1, 2};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        hashMapTwoPassImplementation,
                        TwoSumInput.with(new int[]{-1, 0, 1, 2, 3, 4, -1}, -2),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{0, 6};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        hashMapOnePassImplementation,
                        TwoSumInput.with(new int[]{-1, 0, 1, 2, 3, 4, -1}, -2),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{0, 6};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                )
        );
    }
}
