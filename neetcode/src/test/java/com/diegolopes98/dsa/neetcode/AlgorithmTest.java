package com.diegolopes98.dsa.neetcode;

import com.diegolopes98.dsa.ds.AlgorithmImplementation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Consumer;

public abstract class AlgorithmTest<IN, OUT> {
    @ParameterizedTest(name = "[{index}] given {1}")
    @MethodSource("provideArguments")
    void givenParametrizedArguments_whenCallingImplementation_shouldRunAssertions(
            AlgorithmImplementation<IN, OUT> implementation,
            IN givenInput,
            Consumer<OUT> assertions
    ) {
        assertions.accept(implementation.execute(givenInput));
    }
}
