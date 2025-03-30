package com.diegolopes98.dsa.leetcode;

import com.diegolopes98.dsa.ds.AlgorithmImplementation;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class ParameterizedAlgorithmTest<IN, OUT> {

    protected abstract Stream<Arguments> provideArguments();

    protected abstract Stream<AlgorithmImplementation<IN, OUT>> provideImplementations();

    private Stream<Arguments> provideTestCases() {
        return provideImplementations()
                .flatMap(impl -> provideArguments().map(args -> Arguments.of(
                impl,
                args.get()[0],
                args.get()[1]
        )));
    }

    @ParameterizedTest(name = "[{index}] {0} given {1}")
    @MethodSource("provideTestCases")
    void givenParametrizedArguments_whenCallingImplementation_shouldRunAssertions(
            AlgorithmImplementation<IN, OUT> implementation,
            IN givenInput,
            TestAssertion<IN, OUT> assertions
    ) {
        assertions.accept(givenInput, implementation.execute(givenInput));
    }
}
