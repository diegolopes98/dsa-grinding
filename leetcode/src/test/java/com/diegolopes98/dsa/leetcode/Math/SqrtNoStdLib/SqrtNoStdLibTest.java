package com.diegolopes98.dsa.leetcode.Math.SqrtNoStdLib;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

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
                        TestAssertion.expectedOutputConsumer(0, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(-1),
                        TestAssertion.expectedOutputConsumer(0, Assertions::assertEquals)
                ),
                // 0 and 1
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(0),
                        TestAssertion.expectedOutputConsumer(0, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(0),
                        TestAssertion.expectedOutputConsumer(0, Assertions::assertEquals)
                ), Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(1),
                        TestAssertion.expectedOutputConsumer(1, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(1),
                        TestAssertion.expectedOutputConsumer(1, Assertions::assertEquals)
                ),
                // Above numbers
                Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(4),
                        TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(4),
                        TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                ), Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(8),
                        TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(8),
                        TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                ), Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(16),
                        TestAssertion.expectedOutputConsumer(4, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(16),
                        TestAssertion.expectedOutputConsumer(4, Assertions::assertEquals)
                ), Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(100),
                        TestAssertion.expectedOutputConsumer(10, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(100),
                        TestAssertion.expectedOutputConsumer(10, Assertions::assertEquals)
                ), Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(1000),
                        TestAssertion.expectedOutputConsumer(31, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(1000),
                        TestAssertion.expectedOutputConsumer(31, Assertions::assertEquals)
                ), Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(10000),
                        TestAssertion.expectedOutputConsumer(100, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(10000),
                        TestAssertion.expectedOutputConsumer(100, Assertions::assertEquals)
                ), Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(50000),
                        TestAssertion.expectedOutputConsumer(223, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(50000),
                        TestAssertion.expectedOutputConsumer(223, Assertions::assertEquals)
                ), Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(1000000),
                        TestAssertion.expectedOutputConsumer(1000, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(1000000),
                        TestAssertion.expectedOutputConsumer(1000, Assertions::assertEquals)
                ), Arguments.of(
                        linearImplementation,
                        SqrtNoStdLibInput.with(2000000000),
                        TestAssertion.expectedOutputConsumer(44721, Assertions::assertEquals)
                ), Arguments.of(
                        binarySearchImplementation,
                        SqrtNoStdLibInput.with(2000000000),
                        TestAssertion.expectedOutputConsumer(44721, Assertions::assertEquals)
                )
        );
    }
}
