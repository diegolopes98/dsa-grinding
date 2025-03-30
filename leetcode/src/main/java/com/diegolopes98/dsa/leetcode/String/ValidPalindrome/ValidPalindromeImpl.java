package com.diegolopes98.dsa.leetcode.String.ValidPalindrome;

public class ValidPalindromeImpl implements ValidPalindrome {
    @Override
    public Boolean execute(ValidPalindromeInput input) {
        return isPalindrome(input.s());
    }

    private boolean isPalindrome(String s) {
        var i = 0;
        var j = s.length() - 1;
        while (i < j) {
            while (i < j && isNotAlphaNum(s.charAt(i))) i++;
            while (j > i && isNotAlphaNum(s.charAt(j))) j--;
            if (
                    Character.toLowerCase(s.charAt(i))
                            != Character.toLowerCase(s.charAt(j))
            ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }

    private boolean isNotAlphaNum(char c) {
        return !isAlphaNum(c);
    }
}
