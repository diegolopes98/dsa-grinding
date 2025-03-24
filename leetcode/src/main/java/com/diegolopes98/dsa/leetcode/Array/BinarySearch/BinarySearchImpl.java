package com.diegolopes98.dsa.leetcode.Array.BinarySearch;

public class BinarySearchImpl<T extends Comparable<T>> implements BinarySearch<T> {
    @Override
    public Integer execute(BinarySearchInput<T> input) {
        return search(input.items(), input.target());
    }

    private int search(T[] items, T target) {
        int left = 0, right = items.length - 1;

        while (left <= right) {
            final int mid = left + (right - left) / 2;
            final T curr = items[mid];
            final int compare = curr.compareTo(target);

            if (compare == 0) {
                return mid;
            }

            if (compare > 0) right = mid - 1;
            else left = mid + 1;
        }

        return -1;
    }
}
