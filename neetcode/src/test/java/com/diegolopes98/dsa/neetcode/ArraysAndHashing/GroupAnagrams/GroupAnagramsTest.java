package com.diegolopes98.dsa.neetcode.ArraysAndHashing.GroupAnagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.util.List;

@TestInstance(Lifecycle.PER_CLASS)
class GroupAnagramsTest {

    private GroupAnagrams solution;

    @BeforeAll
    void setup() {
        solution = new GroupAnagramsImpl();
    }

    @Test
    void givenMultipleAnagramsArray_whenCallingGroupAnagrams_shouldGroupThenProperly() {
        final var givenAnagrams = new String[]{"act", "pots", "tops", "cat", "stop", "hat"};
        final var expectedOutput = List.of(List.of("act", "cat"), List.of("pots", "tops", "stop"), List.of("hat"));

        final var actualOutput = solution.groupAnagrams(givenAnagrams);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenSingleAnagramsArray_whenCallingGroupAnagrams_shouldGroupThenProperly() {
        final var givenAnagrams = new String[]{"x"};
        final var expectedOutput = List.of(List.of("x"));

        final var actualOutput = solution.groupAnagrams(givenAnagrams);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void givenEmptyStringAnagramsArray_whenCallingGroupAnagrams_shouldGroupThenProperly() {
        final var givenAnagrams = new String[]{""};
        final var expectedOutput = List.of(List.of(""));

        final var actualOutput = solution.groupAnagrams(givenAnagrams);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}
