package com.diegolopes98.dsa.leetcode.Array.SearchInsertPosition;

public class SearchInsertPositionImpl implements SearchInsertPosition {
    @Override
    public Integer execute(SearchInsertPositionInput input) {
        return searchInsert(input.nums(), input.target());
    }

    private int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            final int curr = nums[mid];
            if (curr == target) {
                return mid;
            } else if (curr < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
