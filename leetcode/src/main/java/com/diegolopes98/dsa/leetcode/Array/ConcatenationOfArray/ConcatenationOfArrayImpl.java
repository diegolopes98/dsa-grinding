package com.diegolopes98.dsa.leetcode.Array.ConcatenationOfArray;

public class ConcatenationOfArrayImpl implements ConcatenationOfArray {
    @Override
    public int[] execute(ConcatenationOfArrayInput input) {
        return getConcatenation(input.nums());
    }

    private int[] getConcatenation(int[] nums) {
        final int l = nums.length;
        int[] numsConcat = new int[l * 2];

        for (int i = 0; i < l; i++) {
            numsConcat[i] = nums[i];
            numsConcat[i + l] = nums[i];
        }

        return numsConcat;
    }
}
