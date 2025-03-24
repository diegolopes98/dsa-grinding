package com.diegolopes98.dsa.neetcode.ArraysAndHashing.ContainsDuplicate;

import com.diegolopes98.dsa.neetcode.AlgorithmTest;
import com.diegolopes98.dsa.neetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
public class ContainsDuplicateTest extends AlgorithmTest<ContainsDuplicateInput, Boolean> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new ContainsDuplicateImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        ContainsDuplicateInput.with(new int[]{0, 1, 2, 2}),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        implementation,
                        ContainsDuplicateInput.with(new int[]{0, 0, 1, 2}),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        implementation,
                        ContainsDuplicateInput.with(new int[]{0, 1, 1, 2}),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        implementation,
                        ContainsDuplicateInput.with(new int[]{-1, 0, 1, 2, -1}),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        implementation,
                        ContainsDuplicateInput.with(new int[]{0, 1, 2}),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                ),

                Arguments.of(
                        implementation,
                        ContainsDuplicateInput.with(new int[]{}),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                )
        );
    }
}
