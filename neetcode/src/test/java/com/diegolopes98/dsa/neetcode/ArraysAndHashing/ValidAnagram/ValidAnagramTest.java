package com.diegolopes98.dsa.neetcode.ArraysAndHashing.ValidAnagram;

import com.diegolopes98.dsa.neetcode.AlgorithmTest;
import com.diegolopes98.dsa.neetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ValidAnagramTest extends AlgorithmTest<ValidAnagramInput, Boolean> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new ValidAnagramImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        ValidAnagramInput.with("sword", "words"),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        implementation,
                        ValidAnagramInput.with("abcde", "edcba"),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertTrue)
                ), Arguments.of(
                        implementation,
                        ValidAnagramInput.with("1234", "123A"),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                ), Arguments.of(
                        implementation,
                        ValidAnagramInput.with("1234", "12345"),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                ), Arguments.of(
                        implementation,
                        ValidAnagramInput.with("hello", "world"),
                        TestAssertion.<Boolean>outputConsumer(Assertions::assertFalse)
                )
        );
    }
}
