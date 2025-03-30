package com.diegolopes98.dsa.leetcode.String.LongestCommonPrefix;

public record LongestCommonPrefixInput(String[] strs) {
    static LongestCommonPrefixInput with(String[] strs) {
        return new LongestCommonPrefixInput(strs);
    }
}
