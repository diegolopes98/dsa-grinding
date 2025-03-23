package com.diegolopes98.dsa.neetcode.ArraysAndHashing.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateImpl implements ContainsDuplicate {

    @Override
    public Boolean execute(ContainsDuplicateInput input) {
        return hasDuplicate(input.nums());
    }

    private boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }
}
