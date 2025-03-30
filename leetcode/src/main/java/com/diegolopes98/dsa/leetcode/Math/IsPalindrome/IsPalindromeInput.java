package com.diegolopes98.dsa.leetcode.Math.IsPalindrome;

public record IsPalindromeInput(int x) {
    static IsPalindromeInput with(int x) {
        return new IsPalindromeInput(x);
    }
}
