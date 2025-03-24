package com.diegolopes98.dsa.leetcode.Array.BinarySearch;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class BinarySearchTest<T extends Comparable<T>> extends AlgorithmTest<BinarySearchInput<T>, Integer> {

    static Stream<Arguments> provideArguments() {
        final var integerImplementation = new BinarySearchImpl<Integer>();
        final var doubleImplementation = new BinarySearchImpl<Double>();
        final var stringImplementation = new BinarySearchImpl<String>();

        return Stream.of(
                // Integer
                Arguments.of(
                        integerImplementation,
                        BinarySearchInput.with(new Integer[]{-1, 0, 1, 3, 5, 7}, -1),
                        TestAssertion.expectedOutputConsumer(0, Assertions::assertEquals)
                ),
                Arguments.of(
                        integerImplementation,
                        BinarySearchInput.with(new Integer[]{-1, 0, 1, 3, 5, 7}, 7),
                        TestAssertion.expectedOutputConsumer(5, Assertions::assertEquals)
                ),
                Arguments.of(
                        integerImplementation,
                        BinarySearchInput.with(new Integer[]{-1, 0, 1, 3, 5, 7}, 0),
                        TestAssertion.expectedOutputConsumer(1, Assertions::assertEquals)
                ),
                Arguments.of(
                        integerImplementation,
                        BinarySearchInput.with(new Integer[]{-1, 0, 1, 3, 5, 7}, 5),
                        TestAssertion.expectedOutputConsumer(4, Assertions::assertEquals)
                ),
                Arguments.of(integerImplementation,
                             BinarySearchInput.with(new Integer[]{1, 3, 5, 7}, 5),
                             TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                ),
                Arguments.of(integerImplementation,
                             BinarySearchInput.with(new Integer[]{1, 3, 5, 7}, 0),
                             TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(integerImplementation,
                             BinarySearchInput.with(new Integer[]{0, 2}, 3),
                             TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(integerImplementation,
                             BinarySearchInput.with(new Integer[]{0}, 2),
                             TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(integerImplementation,
                             BinarySearchInput.with(new Integer[]{0}, -1),
                             TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(integerImplementation,
                             BinarySearchInput.with(new Integer[]{}, 1),
                             TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                // Double
                Arguments.of(
                        doubleImplementation,
                        BinarySearchInput.with(new Double[]{-1.5, 0.0, 1.2, 3.4, 5.6, 7.8}, -1.5),
                        TestAssertion.expectedOutputConsumer(0, Assertions::assertEquals)
                ),
                Arguments.of(
                        doubleImplementation,
                        BinarySearchInput.with(new Double[]{-1.5, 0.0, 1.2, 3.4, 5.6, 7.8}, 7.8),
                        TestAssertion.expectedOutputConsumer(5, Assertions::assertEquals)
                ),
                Arguments.of(
                        doubleImplementation,
                        BinarySearchInput.with(new Double[]{-1.5, 0.0, 1.2, 3.4, 5.6, 7.8}, 0.0),
                        TestAssertion.expectedOutputConsumer(1, Assertions::assertEquals)
                ),
                Arguments.of(
                        doubleImplementation,
                        BinarySearchInput.with(new Double[]{-1.5, 0.0, 1.2, 3.4, 5.6, 7.8}, 5.6),
                        TestAssertion.expectedOutputConsumer(4, Assertions::assertEquals)
                ),
                Arguments.of(
                        doubleImplementation,
                        BinarySearchInput.with(new Double[]{1.1, 3.3, 5.5, 7.7}, 5.5),
                        TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                ),
                Arguments.of(
                        doubleImplementation,
                        BinarySearchInput.with(new Double[]{1.1, 3.3, 5.5, 7.7}, 0.0),
                        TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(
                        doubleImplementation,
                        BinarySearchInput.with(new Double[]{0.0, 2.2}, 3.3),
                        TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(
                        doubleImplementation,
                        BinarySearchInput.with(new Double[]{0.0}, 2.2),
                        TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(
                        doubleImplementation,
                        BinarySearchInput.with(new Double[]{0.0}, -1.1),
                        TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(
                        doubleImplementation,
                        BinarySearchInput.with(new Double[]{}, 1.1),
                        TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                // String
                Arguments.of(
                        stringImplementation,
                        BinarySearchInput.with(new String[]{"apple", "banana", "cherry", "date", "fig", "grape"},
                                               "apple"
                        ),
                        TestAssertion.expectedOutputConsumer(0, Assertions::assertEquals)
                ),
                Arguments.of(
                        stringImplementation,
                        BinarySearchInput.with(new String[]{"apple", "banana", "cherry", "date", "fig", "grape"},
                                               "grape"
                        ),
                        TestAssertion.expectedOutputConsumer(5, Assertions::assertEquals)
                ),
                Arguments.of(
                        stringImplementation,
                        BinarySearchInput.with(new String[]{"apple", "banana", "cherry", "date", "fig", "grape"},
                                               "cherry"
                        ),
                        TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                ),
                Arguments.of(
                        stringImplementation,
                        BinarySearchInput.with(new String[]{"apple", "banana", "cherry", "date", "fig", "grape"},
                                               "fig"
                        ),
                        TestAssertion.expectedOutputConsumer(4, Assertions::assertEquals)
                ),
                Arguments.of(
                        stringImplementation,
                        BinarySearchInput.with(new String[]{"alpha", "beta", "delta", "gamma"}, "delta"),
                        TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                ),
                Arguments.of(
                        stringImplementation,
                        BinarySearchInput.with(new String[]{"alpha", "beta", "delta", "gamma"}, "omega"),
                        TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(
                        stringImplementation,
                        BinarySearchInput.with(new String[]{"cat", "dog"}, "elephant"),
                        TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(
                        stringImplementation,
                        BinarySearchInput.with(new String[]{"lion"}, "zebra"),
                        TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(
                        stringImplementation,
                        BinarySearchInput.with(new String[]{"lion"}, "ant"),
                        TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                ),
                Arguments.of(
                        stringImplementation,
                        BinarySearchInput.with(new String[]{}, "anything"),
                        TestAssertion.expectedOutputConsumer(-1, Assertions::assertEquals)
                )
        );
    }
}
