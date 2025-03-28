package com.diegolopes98.dsa.leetcode.String.MostCommonWord;

import com.diegolopes98.dsa.leetcode.AlgorithmTest;
import com.diegolopes98.dsa.leetcode.TestAssertion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class MostCommonWordTest extends AlgorithmTest<MostCommonWordInput, String> {
    static Stream<Arguments> provideArguments() {
        final var implementation = new MostCommonWordImpl();
        return Stream.of(
                Arguments.of(
                        implementation,
                        MostCommonWordInput.with(
                                "Bob hit a ball, the hit BALL flew far after it was hit.",
                                new String[]{"hit"}
                        ),
                        TestAssertion.expectedOutputConsumer("ball", Assertions::assertEquals)
                ),
                Arguments.of(
                        implementation,
                        MostCommonWordInput.with(
                                "a.",
                                new String[]{""}
                        ),
                        TestAssertion.expectedOutputConsumer("a", Assertions::assertEquals)
                ),
                Arguments.of(
                        implementation,
                        MostCommonWordInput.with(
                                "a.",
                                new String[]{"a"}
                        ),
                        TestAssertion.expectedOutputConsumer("", Assertions::assertEquals)
                ),
                Arguments.of(
                        implementation,
                        MostCommonWordInput.with(
                                ".a.",
                                new String[]{"a"}
                        ),
                        TestAssertion.expectedOutputConsumer("", Assertions::assertEquals)
                ),
                Arguments.of(
                        implementation,
                        MostCommonWordInput.with(
                                ".a.",
                                new String[]{""}
                        ),
                        TestAssertion.expectedOutputConsumer("a", Assertions::assertEquals)
                )
        );
    }
}
