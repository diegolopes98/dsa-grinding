package com.diegolopes98.dsa.leetcode.Math.IsPalindrome;

public class IsPalindromeIntImpl implements IsPalindrome {
    @Override
    public Boolean execute(IsPalindromeInput input) {
        return isPalindrome(input.x());
    }

    private boolean isPalindrome(int num) {
        if (num < 0) return false;
        if (num <= 9) return true;

        int digits = (int) Math.log10(num);
        int divisor = (int) Math.pow(10, digits);

        while (num > 0) {
            int first = num / divisor;
            int last = num % 10;

            if (first != last) return false;

            num = (num % divisor) / 10;

            divisor /= 100;
        }

        return true;
    }
}
