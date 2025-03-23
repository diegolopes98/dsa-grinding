package com.diegolopes98.dsa.leetcode.Array.SearchInsertPosition;

public record SearchInsertPositionInput(int[] nums, int target) {
    static SearchInsertPositionInput with(int[] nums, int target) {
        return new SearchInsertPositionInput(nums, target);
    }
}
