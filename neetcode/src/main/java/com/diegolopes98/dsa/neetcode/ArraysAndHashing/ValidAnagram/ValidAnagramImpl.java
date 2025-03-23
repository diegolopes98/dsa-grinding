package com.diegolopes98.dsa.neetcode.ArraysAndHashing.ValidAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidAnagramImpl implements ValidAnagram {

    @Override
    public Boolean execute(ValidAnagramInput input) {
        return isAnagram(input.s(), input.t());
    }

    private boolean isAnagram(String s, String t) {
        Objects.requireNonNull(s, "Param 's' of isAnagram must be non null");
        Objects.requireNonNull(t, "Param 't' of isAnagram must be non null");

        if (s.length() != t.length()) return false;

        Map<Character, Integer> sOccurrences = getCharacterOccurrences(s);
        Map<Character, Integer> tOccurrences = getCharacterOccurrences(t);

        return sOccurrences.equals(tOccurrences);
    }

    private Map<Character, Integer> getCharacterOccurrences(String s) {
        HashMap<Character, Integer> occurrences = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            occurrences.put(
                    s.charAt(i),
                    occurrences.getOrDefault(s.charAt(i), 0) + 1
            );
        }

        return occurrences;
    }
}
