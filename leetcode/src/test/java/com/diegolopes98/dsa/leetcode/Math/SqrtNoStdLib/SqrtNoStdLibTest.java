package com.diegolopes98.dsa.leetcode.Math.SqrtNoStdLib;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.function.Consumer;
import java.util.stream.Stream;

class SqrtNoStdLibTest extends AlgorithmTest<SqrtNoStdLibInput, Integer> {
    static Stream<Arguments> provideArguments() {
        final var linearImplementation = new SqrtNoStdLibLinearSearchImpl();
        final var binarySearchImplementation = new SqrtNoStdLibBinarySearchImpl();

        return Stream.of(
                // Negative cases
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(-1),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                0,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(-1),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                0,
                                actualOutput
                        )
                ),
                // 0 and 1
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(0),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                0,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(0),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                0,
                                actualOutput
                        )
                ),
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(1),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                1,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(1),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                1,
                                actualOutput
                        )
                ),
                // Above numbers
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(4),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                2,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(4),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                2,
                                actualOutput
                        )
                ),
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(8),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                2,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(8),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                2,
                                actualOutput
                        )
                ),
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(16),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                4,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(16),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                4,
                                actualOutput
                        )
                ),
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(100),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                10,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(100),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                10,
                                actualOutput
                        )
                ),
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(1000),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                31,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(1000),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                31,
                                actualOutput
                        )
                ),
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(10000),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                100,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(10000),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                100,
                                actualOutput
                        )
                ),
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(50000),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                223,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(50000),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                223,
                                actualOutput
                        )
                ),
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(1000000),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                1000,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(1000000),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                1000,
                                actualOutput
                        )
                ),
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(2000000000),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                44721,
                                actualOutput
                        )
                ),
                Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(2000000000),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(
                                44721,
                                actualOutput
                        )
                )
        );
    }
}