package com.diegolopes98.dsa.neetcode.ArraysAndHashing.ValidAnagram;

public record ValidAnagramInput(
        String s, String t
) {
    public static ValidAnagramInput with(
            final String s,
            final String t
    ) {
        return new ValidAnagramInput(s, t);
    }
}
