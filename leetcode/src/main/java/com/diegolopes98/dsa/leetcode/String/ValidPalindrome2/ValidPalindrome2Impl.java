package com.diegolopes98.dsa.leetcode.String.ValidPalindrome2;

public class ValidPalindrome2Impl implements ValidPalindrome2 {
    @Override
    public Boolean execute(ValidPalindrome2Input input) {
        return validPalindrome(input.s());
    }

    private boolean validPalindrome(String s) {
        return isPalindrome(s, 0, s.length() - 1, false);
    }

    private boolean isPalindrome(String s, int i, int j, boolean deleted) {
        while (i < j) {
            if (
                    Character.toLowerCase(s.charAt(i))
                            != Character.toLowerCase(s.charAt(j))
            ) {
                if (deleted) return false;

                return isPalindrome(s, i + 1, j, true) || isPalindrome(s, i, j - 1, true);
            }
            i++;
            j--;
        }
        return true;
    }
}
