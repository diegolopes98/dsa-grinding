package com.diegolopes98.dsa.leetcode.Math.SqrtNoStdLib;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SqrtNoStdLibTest {

    static Stream<Arguments> provideArguments() {
        final var linearImplementation = new SqrtNoStdLibLinearSearchImpl();
        final var binarySearchImplementation = new SqrtNoStdLibBinarySearchImpl();

        return Stream.of(
                // Negative cases
                Arguments.of(linearImplementation, -1, 0),
                Arguments.of(binarySearchImplementation, -1, 0),
                // 0 and 1
                Arguments.of(linearImplementation, 0, 0),
                Arguments.of(binarySearchImplementation, 0, 0),
                Arguments.of(linearImplementation, 1, 1),
                Arguments.of(binarySearchImplementation, 1, 1),
                // Above numbers
                Arguments.of(linearImplementation,4, 2),
                Arguments.of(binarySearchImplementation,4, 2),
                Arguments.of(linearImplementation,8, 2),
                Arguments.of(binarySearchImplementation,8, 2),
                Arguments.of(linearImplementation,16, 4),
                Arguments.of(binarySearchImplementation,16, 4),
                Arguments.of(linearImplementation,100, 10),
                Arguments.of(binarySearchImplementation,100, 10),
                Arguments.of(linearImplementation,1000, 31),
                Arguments.of(binarySearchImplementation,1000, 31),
                Arguments.of(linearImplementation,10000, 100),
                Arguments.of(binarySearchImplementation,10000, 100),
                Arguments.of(linearImplementation,50000, 223),
                Arguments.of(binarySearchImplementation,50000, 223),
                Arguments.of(linearImplementation,1000000, 1000),
                Arguments.of(binarySearchImplementation,1000000, 1000),
                Arguments.of(linearImplementation,2000000000, 44721),
                Arguments.of(binarySearchImplementation,2000000000, 44721)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArguments")
    void givenParametrizedArguments_whenCallingImplementation_shouldReturnExpectedResult(
            SqrtNoStdLib implementation,
            Integer numberToFindSqrt,
            Integer expectedSqrt
    ) {
        Assertions.assertEquals(expectedSqrt, implementation.mySqrt(numberToFindSqrt));
    }
}