package com.diegolopes98.dsa.leetcode.Math.SqrtNoStdLib;

public class SqrtNoStdLibLinearSearchImpl implements SqrtNoStdLib {
    @Override
    public int mySqrt(int x) {
        if (x < 0) return 0;

        int sqrt = 0;

        for (int i = 1; i * i <= x; i++) sqrt = i;

        return sqrt;
    }
}
