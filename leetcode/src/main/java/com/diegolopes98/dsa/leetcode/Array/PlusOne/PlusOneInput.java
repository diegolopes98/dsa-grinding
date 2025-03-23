package com.diegolopes98.dsa.leetcode.Array.PlusOne;

public record PlusOneInput(int[] digits) {
    static PlusOneInput with(int[] digits) {
        return new PlusOneInput(digits);
    }
}
