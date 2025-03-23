package com.diegolopes98.dsa.neetcode.TwoPointers.ValidPalindrome;

public class ValidPalindromeImpl implements ValidPalindrome {
    @Override
    public Boolean execute(ValidPalindromeInput input) {
        return isPalindrome(input.s());
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        var i = 0;
        var j = s.length() - 1;
        while (i < j) {
            while (i < j && isNotAlphaNum(chars[i])) i++;
            while (j > i && isNotAlphaNum(chars[j])) j--;
            if (
                    Character.toLowerCase(chars[i])
                            != Character.toLowerCase(chars[j])
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
