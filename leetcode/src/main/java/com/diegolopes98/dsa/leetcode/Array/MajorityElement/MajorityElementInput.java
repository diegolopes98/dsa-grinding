package com.diegolopes98.dsa.leetcode.Array.MajorityElement;

public record MajorityElementInput(int[] nums) {
    static MajorityElementInput with(int[] nums) {
        return new MajorityElementInput(nums);
    }
}
