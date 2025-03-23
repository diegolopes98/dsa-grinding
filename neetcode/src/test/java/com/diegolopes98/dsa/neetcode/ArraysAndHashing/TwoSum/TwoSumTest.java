package com.diegolopes98.dsa.neetcode.ArraysAndHashing.TwoSum;

import com.diegolopes98.dsa.neetcode.AlgorithmTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.function.Consumer;
import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
public class TwoSumTest extends AlgorithmTest<TwoSumInput, int[]> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new TwoSumImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        TwoSumInput.with(new int[]{-1, 0, 1, 2, 3, 4, 5}, -1),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{0, 1};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        implementation,
                        TwoSumInput.with(new int[]{-1, 0, 1, 2, 3, 4, 5}, 9),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{5, 6};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        implementation,
                        TwoSumInput.with(new int[]{-1, 2, 3, 5}, 5),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{1, 2};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        implementation,
                        TwoSumInput.with(new int[]{-1, 0, 1, 2, 3, 4, -1}, -2),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{0, 6};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                )
        );
    }
}