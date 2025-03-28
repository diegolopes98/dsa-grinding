package com.diegolopes98.dsa.leetcode.String.MostCommonWord;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MostCommonWordImpl implements MostCommonWord {
    @Override
    public String execute(MostCommonWordInput input) {
        return mostCommonWord(input.paragraph(), input.banned());
    }

    private String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        String result = "";
        int resultCount = 0;

        int index = 0;
        while (index < paragraph.length()) {
            if (isNotLetter(paragraph.charAt(index))) {
                index += 1;
                continue;
            }

            String word = getLowerCaseWord(paragraph, index);

            if (!bannedSet.contains(word)) {
                int count = wordCount.getOrDefault(word, 0) + 1;
                if (count > resultCount) {
                    result = word;
                    resultCount = count;
                }
                wordCount.put(word, count);
            }

            index += word.length();
        }

        return result;
    }

    private String getLowerCaseWord(String paragraph, int index) {
        StringBuilder majorityBuilder = new StringBuilder();

        while (index < paragraph.length() && isLetter(paragraph.charAt(index))) {
            majorityBuilder.append(Character.toLowerCase(paragraph.charAt(index)));
            index++;
        }

        return majorityBuilder.toString();
    }

    private boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
    }

    private boolean isNotLetter(char c) {
        return !isLetter(c);
    }
}
