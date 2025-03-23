package com.diegolopes98.dsa.neetcode.ArraysAndHashing.TopKFrequentElements;

public record TopKFrequentElementsInput(int[] nums, int k) {
    static TopKFrequentElementsInput with(int[] nums, int k) {
        return new TopKFrequentElementsInput(nums, k);
    }
}
