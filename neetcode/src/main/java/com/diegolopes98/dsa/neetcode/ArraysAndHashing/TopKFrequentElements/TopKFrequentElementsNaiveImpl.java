package com.diegolopes98.dsa.neetcode.ArraysAndHashing.TopKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElementsNaiveImpl implements TopKFrequentElements {
    @Override
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            arr.add(new int[]{entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);

        int[] tops = new int[k];
        for (int i = 0; i < k; i++) {
            tops[i] = arr.get(i)[1];

        }

        return tops;
    }
}
