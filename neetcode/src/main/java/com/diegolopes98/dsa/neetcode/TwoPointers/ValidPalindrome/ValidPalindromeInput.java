package com.diegolopes98.dsa.neetcode.TwoPointers.ValidPalindrome;

public record ValidPalindromeInput(String s) {
    static ValidPalindromeInput with(String s) {
        return new ValidPalindromeInput(s);
    }
}
