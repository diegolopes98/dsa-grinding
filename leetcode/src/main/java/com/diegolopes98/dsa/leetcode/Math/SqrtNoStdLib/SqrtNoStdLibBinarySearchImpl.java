package com.diegolopes98.dsa.leetcode.Math.SqrtNoStdLib;

public class SqrtNoStdLibBinarySearchImpl implements SqrtNoStdLib {
    @Override
    public int mySqrt(int x) {
        if (x < 0) return 0;
        if (x == 1 || x == 0) return x;

        int left = 2;
        int right = x / 2;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long compare = (long) mid * mid;

            if (compare == x) return mid;

            if (compare > x) right = mid - 1;
            else left = mid + 1;
        }

        return right;
    }
}
