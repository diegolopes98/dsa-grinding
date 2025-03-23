package com.diegolopes98.dsa.neetcode.ArraysAndHashing.GroupAnagrams;

public record GroupAnagramsInput(String[] strs) {
    static GroupAnagramsInput with(String[] strs) {
        return new GroupAnagramsInput(strs);
    }
}
