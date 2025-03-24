package com.diegolopes98.dsa.leetcode.Array.BinarySearch;

public record BinarySearchInput<T extends Comparable<T>>(T[] items, T target) {
    static <T extends Comparable<T>> BinarySearchInput<T> with(T[] items, T target) {
        return new BinarySearchInput<T>(items, target);
    }
}
