package com.diegolopes98.dsa.leetcode.Array.MajorityElement;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class MajorityElementTest extends AlgorithmTest<MajorityElementInput, Integer> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new MajorityElementImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        MajorityElementInput.with(new int[]{3,2,3}),
                        TestAssertion.expectedOutputConsumer(3, Assertions::assertEquals)
                ),
                Arguments.of(
                        implementation,
                        MajorityElementInput.with(new int[]{2,2,1,1,1,2,2}),
                        TestAssertion.expectedOutputConsumer(2, Assertions::assertEquals)
                )
        );
    }
}
