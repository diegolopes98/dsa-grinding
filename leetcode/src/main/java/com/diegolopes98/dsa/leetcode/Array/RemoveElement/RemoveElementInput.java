package com.diegolopes98.dsa.leetcode.Array.RemoveElement;

public record RemoveElementInput(int[] nums, int val) {
    static RemoveElementInput with(int[] nums, int val) {
        return new RemoveElementInput(nums, val);
    }
}
