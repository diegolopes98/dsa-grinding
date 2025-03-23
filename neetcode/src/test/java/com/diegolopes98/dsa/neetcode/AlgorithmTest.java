package com.diegolopes98.dsa.neetcode;

import com.diegolopes98.dsa.ds.AlgorithmImplementation;
import org.apache.commons.lang3.NotImplementedException;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Consumer;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class AlgorithmTest<IN, OUT> {
    static Stream<Arguments> provideArguments() {
        throw new NotImplementedException("Method created to compile, must implement in child class to work");
    }

    @ParameterizedTest(name = "{index} => given {1}")
    @MethodSource("provideArguments")
    void givenParametrizedArguments_whenCallingImplementation_shouldRunAssertions(
            AlgorithmImplementation<IN, OUT> implementation,
            IN givenInput,
            Consumer<OUT> assertions
    ) {
        assertions.accept(implementation.execute(givenInput));
    }
}
