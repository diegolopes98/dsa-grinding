package com.diegolopes98.dsa.leetcode.Math.SqrtNoStdLib;

public record SqrtNoStdLibInput(int x) {
    static SqrtNoStdLibInput with(int x) {
        return new SqrtNoStdLibInput(x);
    }
}
