package com.diegolopes98.dsa.neetcode.ArraysAndHashing.TopKFrequentElements;

import com.diegolopes98.dsa.neetcode.AlgorithmTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.function.Consumer;
import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
class TopKFrequentElementsTest extends AlgorithmTest<TopKFrequentElementsInput, int[]> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new TopKFrequentElementsNaiveImpl();
        return Stream.of(
                Arguments.of(
                        implementation,
                        TopKFrequentElementsInput.with(new int[]{1, 2, 2, 3, 3, 3}, 2),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{3, 2};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        implementation,
                        TopKFrequentElementsInput.with(new int[]{7, 7}, 1),
                        (Consumer<int[]>) actualOutput -> {
                            final var expectedOutput = new int[]{7};
                            Assertions.assertArrayEquals(expectedOutput, actualOutput);
                        }
                )
        );
    }
}