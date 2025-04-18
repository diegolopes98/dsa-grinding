package com.diegolopes98.dsa.leetcode.String.LongestCommonPrefix;

public class LongestCommonPrefixTraverseImpl implements LongestCommonPrefix {
    @Override
    public String execute(LongestCommonPrefixInput input) {
        return longestCommonPrefix(input.strs());
    }

    private String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 ) return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if(prefix.isEmpty()) break;
        }

        return prefix;
    }

    @Override
    public String toString() {
        return "LongestCommonPrefixTraverseImpl";
    }
}
