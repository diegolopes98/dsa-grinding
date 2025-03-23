package com.diegolopes98.dsa.leetcode.Array.SearchInsertPosition;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
class SearchInsertPositionTest extends AlgorithmTest<SearchInsertPositionInput, Integer> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new SearchInsertPositionImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 4, 5, 6}, 4),
                        TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 4, 5, 6}, 1),
                        TestAssertion.expectedOutputConsumer(0, Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 4, 5, 6}, 6),
                        TestAssertion.expectedOutputConsumer(4, Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 5, 6, 7}, 4),
                        TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{2, 3, 4, 5, 6}, 1),
                        TestAssertion.expectedOutputConsumer(0, Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 2, 3, 4, 5}, 6),
                        TestAssertion.expectedOutputConsumer(5, Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 5, 6}, 2),
                        TestAssertion.expectedOutputConsumer(1, Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 5, 6}, 7),
                        TestAssertion.expectedOutputConsumer(4, Assertions::assertEquals)
                )
        );
    }
}
