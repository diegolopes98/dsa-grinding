package com.diegolopes98.dsa.leetcode.Array.RemoveDuplicatesFromSortedArray;

public record RemoveDuplicatesFromSortedArrayInput(int[] nums) {
    static RemoveDuplicatesFromSortedArrayInput with(int[] nums) {
        return new RemoveDuplicatesFromSortedArrayInput(nums);
    }
}
