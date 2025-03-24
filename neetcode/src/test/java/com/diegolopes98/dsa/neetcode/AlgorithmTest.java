package com.diegolopes98.dsa.neetcode;

import com.diegolopes98.dsa.ds.AlgorithmImplementation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public abstract class AlgorithmTest<IN, OUT> {
    static Stream<Arguments> provideArguments() {
        throw new UnsupportedOperationException("Must be implemented");
    }

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
