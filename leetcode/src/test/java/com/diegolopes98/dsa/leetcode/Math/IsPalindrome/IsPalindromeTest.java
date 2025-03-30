package com.diegolopes98.dsa.leetcode.Math.IsPalindrome;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class IsPalindromeTest extends AlgorithmTest<IsPalindromeInput, Boolean> {

    static Stream<Arguments> provideArguments() {
        final var intImplementation = new IsPalindromeIntImpl();

        return Stream.of(
                Arguments.of(
                        intImplementation,
                        IsPalindromeInput.with(123421),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                ), Arguments.of(
                        intImplementation,
                        IsPalindromeInput.with(123321),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        intImplementation,
                        IsPalindromeInput.with(12321),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        intImplementation,
                        IsPalindromeInput.with(1221),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        intImplementation,
                        IsPalindromeInput.with(121),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        intImplementation,
                        IsPalindromeInput.with(-121),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                ), Arguments.of(
                        intImplementation,
                        IsPalindromeInput.with(10),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                ), Arguments.of(
                        intImplementation,
                        IsPalindromeInput.with(9),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        intImplementation,
                        IsPalindromeInput.with(1),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        intImplementation,
                        IsPalindromeInput.with(0),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                )
        );
    }
}
