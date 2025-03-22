package com.diegolopes98.dsa.leetcode.Array.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMapOnePassImpl implements TwoSum {

    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> comps = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (comps.containsKey(diff)) {
                return new int[]{comps.get(diff), i};
            }

            comps.put(num, i);
        }

        return new int[]{-1, -1};
    }
}
