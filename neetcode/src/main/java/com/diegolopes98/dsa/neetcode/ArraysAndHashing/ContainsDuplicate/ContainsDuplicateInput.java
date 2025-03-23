package com.diegolopes98.dsa.neetcode.ArraysAndHashing.ContainsDuplicate;

public record ContainsDuplicateInput(int[] nums) {
    static ContainsDuplicateInput with(int[] nums) {
        return new ContainsDuplicateInput(nums);
    }
}
