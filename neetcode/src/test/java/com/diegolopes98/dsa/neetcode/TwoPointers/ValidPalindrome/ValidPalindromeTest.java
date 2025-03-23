package com.diegolopes98.dsa.neetcode.TwoPointers.ValidPalindrome;

import com.diegolopes98.dsa.neetcode.AlgorithmTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.provider.Arguments;

import java.util.function.Consumer;
import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
class ValidPalindromeTest extends AlgorithmTest<ValidPalindromeInput, Boolean> {

    static Stream<Arguments> provideArguments() {
        final var implementation = new ValidPalindromeImpl();
        return Stream.of(
                Arguments.of(
                        implementation,
                        ValidPalindromeInput.with("Was it a car or a cat I saw?"),
                        (Consumer<Boolean>) Assertions::assertTrue
                ),
                Arguments.of(
                        implementation,
                        ValidPalindromeInput.with("tab a cat"),
                        (Consumer<Boolean>) Assertions::assertFalse
                ),
                Arguments.of(
                        implementation,
                        ValidPalindromeInput.with(""),
                        (Consumer<Boolean>) Assertions::assertTrue
                ),
                Arguments.of(
                        implementation,
                        ValidPalindromeInput.with(" "),
                        (Consumer<Boolean>) Assertions::assertTrue
                ),
                Arguments.of(
                        implementation,
                        ValidPalindromeInput.with(" !+-_!@#$%*()}{]["),
                        (Consumer<Boolean>) Assertions::assertTrue
                )
        );
    }
}