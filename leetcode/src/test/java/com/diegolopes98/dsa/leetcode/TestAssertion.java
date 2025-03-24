package com.diegolopes98.dsa.leetcode;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

@FunctionalInterface
public interface TestAssertion<IN, OUT> {
    static <OUT> TestAssertion<Object, OUT> outputConsumer(Consumer<OUT> consumer) {
        return (input, output) -> consumer.accept(output);
    }

    static <IN> TestAssertion<IN, Object> inputConsumer(Consumer<IN> consumer) {
        return (input, output) -> consumer.accept(input);
    }

    static <OUT> TestAssertion<Object, OUT> expectedOutputConsumer(OUT expected, BiConsumer<OUT, OUT> consumer) {
        return (input, output) -> consumer.accept(expected, output);
    }

    static <IN, OUT> TestAssertion<IN, OUT> inputOutputConsumer(BiConsumer<IN, OUT> biConsumer) {
        return biConsumer::accept;
    }

    void accept(IN injected, OUT output);
}
