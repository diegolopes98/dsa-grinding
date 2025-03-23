package com.diegolopes98.dsa.neetcode.ArraysAndHashing.GroupAnagrams;

import com.diegolopes98.dsa.neetcode.AlgorithmTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
class GroupAnagramsTest extends AlgorithmTest<GroupAnagramsInput, List<List<String>>> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new GroupAnagramsImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        GroupAnagramsInput.with(new String[]{"act", "pots", "tops", "cat", "stop", "hat"}),
                        (Consumer<List<List<String>>>) actualOutput -> {
                            final var expectedOutput = List.of(
                                    List.of("act", "cat"),
                                    List.of("pots", "tops", "stop"),
                                    List.of("hat")
                            );

                            Assertions.assertEquals(expectedOutput, actualOutput);
                        }
                 ),
                Arguments.of(
                        implementation,
                        GroupAnagramsInput.with(new String[]{"x"}),
                        (Consumer<List<List<String>>>) actualOutput -> {
                            final var expectedOutput = List.of(
                                    List.of("x")
                            );

                            Assertions.assertEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        implementation,
                        GroupAnagramsInput.with(new String[]{""}),
                        (Consumer<List<List<String>>>) actualOutput -> {
                            final var expectedOutput = List.of(
                                    List.of("")
                            );

                            Assertions.assertEquals(expectedOutput, actualOutput);
                        }
                ),
                Arguments.of(
                        implementation,
                        GroupAnagramsInput.with(new String[]{}),
                        (Consumer<List<List<String>>>) actualOutput -> {
                            final var expectedOutput = List.of();

                            Assertions.assertEquals(expectedOutput, actualOutput);
                        }
                )
        );
    }
}
