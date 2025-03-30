package com.diegolopes98.dsa.leetcode.String.ValidPalindrome;

public record ValidPalindromeInput(String s) {
    static ValidPalindromeInput with(String s) {
        return new ValidPalindromeInput(s);
    }
}
