package com.diegolopes98.dsa.leetcode.Array.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMapTwoPassImpl implements TwoSum {

    @Override
    public int[] execute(TwoSumInput input) {
        return twoSum(input.nums(), input.target());
    }

    private int[] twoSum(int[] nums, int target) {
        int[] indexes = {-1, -1};

        Map<Integer, Integer> comps = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            comps.put(target - num, i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            if (comps.containsKey(num) && comps.get(num) != i) {
                indexes[0] = i;
                indexes[1] = comps.get(num);
                return indexes;
            }
        }

        return indexes;
    }
}
