package com.diegolopes98.dsa.leetcode.String.MostCommonWord;

public record MostCommonWordInput(String paragraph, String[] banned) {
    static MostCommonWordInput with(String paragraph, String[] banned) {
        return new MostCommonWordInput(paragraph, banned);
    }
}
