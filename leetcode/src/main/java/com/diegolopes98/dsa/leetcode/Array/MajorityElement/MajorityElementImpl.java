package com.diegolopes98.dsa.leetcode.Array.MajorityElement;

public class MajorityElementImpl implements MajorityElement {
    @Override
    public Integer execute(MajorityElementInput input) {
        return majorityElement(input.nums());
    }

    private int majorityElement(int[] nums) {
        int majority = 0;
        int count = 0;

        for (int n : nums) {
            if (count == 0) majority = n;
            if (n == majority) count += 1;
            else count -= 1;
        }

        return majority;
    }
}
