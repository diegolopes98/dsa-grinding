package com.diegolopes98.dsa.leetcode.Array.PlusOne;

public class PlusOneImpl implements PlusOne {
    @Override
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                continue;
            }
            digits[i] += 1;
            return digits;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
