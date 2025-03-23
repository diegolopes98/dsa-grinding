package com.diegolopes98.dsa.leetcode;

import com.diegolopes98.dsa.ds.AlgorithmImplementation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public abstract class AlgorithmTest<IN, OUT> {
    @ParameterizedTest(name = "[{index}] given {1}")
    @MethodSource("provideArguments")
    void givenParametrizedArguments_whenCallingImplementation_shouldRunAssertions(
            AlgorithmImplementation<IN, OUT> implementation,
            IN givenInput,
            TestAssertion<IN, OUT> assertions
    ) {
        assertions.accept(givenInput, implementation.execute(givenInput));
    }
}
