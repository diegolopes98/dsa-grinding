package com.diegolopes98.dsa.leetcode.String.LongestCommonPrefix;

import com.diegolopes98.dsa.ds.AlgorithmImplementation;
import com.diegolopes98.dsa.leetcode.ParameterizedAlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class LongestCommonPrefixTest extends ParameterizedAlgorithmTest<LongestCommonPrefixInput, String> {

    @Override
    protected Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of(
                        LongestCommonPrefixInput.with(new String[]{"foo", "foobar", "foc"}),
                        TestAssertion.expectedOutputConsumer("fo", Assertions::assertEquals)
                )
        );
    }

    @Override
    protected Stream<AlgorithmImplementation<LongestCommonPrefixInput, String>> provideImplementations() {
        return Stream.of(
                new LongestCommonPrefixTraverseImpl()
        );
    }
}
