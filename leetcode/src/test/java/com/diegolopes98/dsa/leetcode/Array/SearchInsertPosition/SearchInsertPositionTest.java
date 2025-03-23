package com.diegolopes98.dsa.leetcode.Array.SearchInsertPosition;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.function.Consumer;
import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
class SearchInsertPositionTest extends AlgorithmTest<SearchInsertPositionInput, Integer> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new SearchInsertPositionImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 4, 5, 6}, 4),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(2, actualOutput)
                ),
                Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 4, 5, 6}, 1),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(0, actualOutput)
                ),
                Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 4, 5, 6}, 6),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(4, actualOutput)
                ),
                Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 5, 6, 7}, 4),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(2, actualOutput)
                ),
                Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{2, 3, 4, 5, 6}, 1),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(0, actualOutput)
                ),
                Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 2, 3, 4, 5}, 6),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(5, actualOutput)
                ),
                Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 5, 6}, 2),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(1, actualOutput)
                ),
                Arguments.of(
                        implementation,
                        SearchInsertPositionInput.with(new int[]{1, 3, 5, 6}, 7),
                        (Consumer<Integer>) actualOutput -> Assertions.assertEquals(4, actualOutput)
                )
        );
    }
}