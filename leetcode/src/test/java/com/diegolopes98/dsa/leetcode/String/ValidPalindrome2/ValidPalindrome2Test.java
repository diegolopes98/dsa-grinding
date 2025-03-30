package com.diegolopes98.dsa.leetcode.String.ValidPalindrome2;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class ValidPalindrome2Test extends AlgorithmTest<ValidPalindrome2Input, Boolean> {

    static Stream<Arguments> provideArguments() {
        final var implementation = new ValidPalindrome2Impl();
        return Stream.of(
                Arguments.of(
                        implementation,
                        ValidPalindrome2Input.with("abc"),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                ), Arguments.of(
                        implementation,
                        ValidPalindrome2Input.with("abca"),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        implementation,
                        ValidPalindrome2Input.with("tab a cat"),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                ), Arguments.of(
                        implementation,
                        ValidPalindrome2Input.with(""),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        implementation,
                        ValidPalindrome2Input.with(" "),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        implementation,
                        ValidPalindrome2Input.with(" !+-_!@#$%*()}{]["),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                )
        );
    }
}
