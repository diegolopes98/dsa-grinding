package com.diegolopes98.dsa.leetcode.Array.MergeSortedArray;

public record MergeSortedArrayInput(int[] nums1, int m, int[] nums2, int n) {
    static MergeSortedArrayInput with(int[] nums1, int m, int[] nums2, int n) {
        return new MergeSortedArrayInput(nums1, m, nums2, n);
    }
}
