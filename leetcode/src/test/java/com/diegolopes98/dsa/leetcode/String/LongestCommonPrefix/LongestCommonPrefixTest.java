package com.diegolopes98.dsa.leetcode.String.LongestCommonPrefix;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class LongestCommonPrefixTest extends AlgorithmTest<LongestCommonPrefixInput, String> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new LongestCommonPrefixTraverseImpl();
        return Stream.of(
                Arguments.of(
                        implementation,
                        LongestCommonPrefixInput.with(new String[]{"foo", "foobar", "foc"}),
                        TestAssertion.expectedOutputConsumer("fo", Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        LongestCommonPrefixInput.with(new String[]{"flower", "flow", "flight"}),
                        TestAssertion.expectedOutputConsumer("fl", Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        LongestCommonPrefixInput.with(new String[]{"flower", "flow", "fein"}),
                        TestAssertion.expectedOutputConsumer("f", Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        LongestCommonPrefixInput.with(new String[]{"foo", "banana", "foc"}),
                        TestAssertion.expectedOutputConsumer("", Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        LongestCommonPrefixInput.with(new String[]{"", "f"}),
                        TestAssertion.expectedOutputConsumer("", Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        LongestCommonPrefixInput.with(new String[]{""}),
                        TestAssertion.expectedOutputConsumer("", Assertions::assertEquals)
                ), Arguments.of(
                        implementation,
                        LongestCommonPrefixInput.with(new String[]{}),
                        TestAssertion.expectedOutputConsumer("", Assertions::assertEquals)
                )
        );
    }
}