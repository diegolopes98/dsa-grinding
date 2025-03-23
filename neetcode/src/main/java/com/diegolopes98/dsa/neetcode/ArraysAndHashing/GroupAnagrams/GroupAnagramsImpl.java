package com.diegolopes98.dsa.neetcode.ArraysAndHashing.GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagramsImpl implements GroupAnagrams {
    @Override
    public List<List<String>> execute(GroupAnagramsInput input) {
        return groupAnagrams(input.strs());
    }

    private List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
