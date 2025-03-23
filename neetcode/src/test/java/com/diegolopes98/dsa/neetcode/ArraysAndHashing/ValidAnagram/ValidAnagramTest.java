package com.diegolopes98.dsa.neetcode.ArraysAndHashing.ValidAnagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.stream.Stream;

@TestInstance(Lifecycle.PER_CLASS)
public class ValidAnagramTest {

    static Stream<Arguments> provideArguments() {
        final var implementation = new ValidAnagramImpl();

        return Stream.of(
                Arguments.of(
                        implementation,
                        ValidAnagramInput.with("sword", "words"),
                        (Consumer<BooleanSupplier>) Assertions::assertTrue
                ),
                Arguments.of(
                        implementation,
                        ValidAnagramInput.with("abcde", "edcba"),
                        (Consumer<BooleanSupplier>) Assertions::assertTrue
                ),
                Arguments.of(
                        implementation,
                        ValidAnagramInput.with("1234", "123A"),
                        (Consumer<BooleanSupplier>) Assertions::assertFalse
                ),
                Arguments.of(
                        implementation,
                        ValidAnagramInput.with("1234", "12345"),
                        (Consumer<BooleanSupplier>) Assertions::assertFalse
                ),
                Arguments.of(
                        implementation,
                        ValidAnagramInput.with("hello", "world"),
                        (Consumer<BooleanSupplier>) Assertions::assertFalse
                )
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void givenParametrizedArguments_whenCallingImplementation_shouldReturnExpectedResult(
            ValidAnagram implementation,
            ValidAnagramInput givenInput,
            Consumer<BooleanSupplier> assertion

    ) {
        assertion.accept(() -> implementation.execute(givenInput));
    }
}
