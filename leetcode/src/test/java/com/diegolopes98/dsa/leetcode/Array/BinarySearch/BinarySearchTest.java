package com.diegolopes98.dsa.leetcode.Array.BinarySearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class BinarySearchTest {

    static Stream<Arguments> provideArguments() {
        final var integerImplementation = new BinarySearchImpl<Integer>();
        final var doubleImplementation = new BinarySearchImpl<Double>();
        final var stringImplementation = new BinarySearchImpl<String>();

        return Stream.of(
                // Integer
                Arguments.of(integerImplementation, new Integer[]{-1, 0, 1, 3, 5, 7}, -1, 0),
                Arguments.of(integerImplementation, new Integer[]{-1, 0, 1, 3, 5, 7}, 7, 5),
                Arguments.of(integerImplementation, new Integer[]{-1, 0, 1, 3, 5, 7}, 0, 1),
                Arguments.of(integerImplementation, new Integer[]{-1, 0, 1, 3, 5, 7}, 5, 4),
                Arguments.of(integerImplementation, new Integer[]{1, 3, 5, 7}, 5, 2),
                Arguments.of(integerImplementation, new Integer[]{1, 3, 5, 7}, 0, -1),
                Arguments.of(integerImplementation, new Integer[]{0, 2}, 3, -1),
                Arguments.of(integerImplementation, new Integer[]{0}, 2, -1),
                Arguments.of(integerImplementation, new Integer[]{0}, -1, -1),
                Arguments.of(integerImplementation, new Integer[]{}, 1, -1),
                // Double
                Arguments.of(doubleImplementation, new Double[]{-1.5, 0.0, 1.2, 3.4, 5.6, 7.8}, -1.5, 0),
                Arguments.of(doubleImplementation, new Double[]{-1.5, 0.0, 1.2, 3.4, 5.6, 7.8}, 7.8, 5),
                Arguments.of(doubleImplementation, new Double[]{-1.5, 0.0, 1.2, 3.4, 5.6, 7.8}, 0.0, 1),
                Arguments.of(doubleImplementation, new Double[]{-1.5, 0.0, 1.2, 3.4, 5.6, 7.8}, 5.6, 4),
                Arguments.of(doubleImplementation, new Double[]{1.1, 3.3, 5.5, 7.7}, 5.5, 2),
                Arguments.of(doubleImplementation, new Double[]{1.1, 3.3, 5.5, 7.7}, 0.0, -1),
                Arguments.of(doubleImplementation, new Double[]{0.0, 2.2}, 3.3, -1),
                Arguments.of(doubleImplementation, new Double[]{0.0}, 2.2, -1),
                Arguments.of(doubleImplementation, new Double[]{0.0}, -1.1, -1),
                Arguments.of(doubleImplementation, new Double[]{}, 1.1, -1),
                // String
                Arguments.of(stringImplementation, new String[]{"apple", "banana", "cherry", "date", "fig", "grape"}, "apple", 0),
                Arguments.of(stringImplementation, new String[]{"apple", "banana", "cherry", "date", "fig", "grape"}, "grape", 5),
                Arguments.of(stringImplementation, new String[]{"apple", "banana", "cherry", "date", "fig", "grape"}, "cherry", 2),
                Arguments.of(stringImplementation, new String[]{"apple", "banana", "cherry", "date", "fig", "grape"}, "fig", 4),
                Arguments.of(stringImplementation, new String[]{"alpha", "beta", "delta", "gamma"}, "delta", 2),
                Arguments.of(stringImplementation, new String[]{"alpha", "beta", "delta", "gamma"}, "omega", -1),
                Arguments.of(stringImplementation, new String[]{"cat", "dog"}, "elephant", -1),
                Arguments.of(stringImplementation, new String[]{"lion"}, "zebra", -1),
                Arguments.of(stringImplementation, new String[]{"lion"}, "ant", -1),
                Arguments.of(stringImplementation, new String[]{}, "anything", -1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    <T extends Comparable<T>> void givenParametrizedArguments_whenCallingImplementation_shouldReturnExpectedResult(
            BinarySearch<T> implementation,
            T[] items,
            T target,
            Integer expected
    ) {
        Assertions.assertEquals(expected, implementation.search(items, target));
    }
}
