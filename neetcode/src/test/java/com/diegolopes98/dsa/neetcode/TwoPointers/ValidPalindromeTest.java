package com.diegolopes98.dsa.neetcode.TwoPointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class ValidPalindromeTest {

    private ValidPalindrome solution;

    @BeforeAll
    void setup() {
        solution = new ValidPalindromeImpl();
    }

    @Test
    void givenAValidAlphaNumPalindrome_whenCallingIsPalindrome_shouldReturnTrue() {
        final var givenSupposedPalindrome = "Was it a car or a cat I saw?";

        final var actualOutput = solution.isPalindrome(givenSupposedPalindrome);

        Assertions.assertTrue(actualOutput);
    }

    @Test
    void givenAnInvalidAlphaNumPalindrome_whenCallingIsPalindrome_shouldReturnTrue() {
        final var givenSupposedPalindrome = "tab a cat";

        final var actualOutput = solution.isPalindrome(givenSupposedPalindrome);

        Assertions.assertFalse(actualOutput);
    }

    @Test
    void givenAnEmptyPalindrome_whenCallingIsPalindrome_shouldReturnTrue() {
        final var givenSupposedPalindrome = "";

        final var actualOutput = solution.isPalindrome(givenSupposedPalindrome);

        Assertions.assertTrue(actualOutput);
    }

    @Test
    void givenASpaceStringPalindrome_whenCallingIsPalindrome_shouldReturnTrue() {
        final var givenSupposedPalindrome = " ";

        final var actualOutput = solution.isPalindrome(givenSupposedPalindrome);

        Assertions.assertTrue(actualOutput);
    }

    @Test
    void givenASpecialCharsStringPalindrome_whenCallingIsPalindrome_shouldReturnTrue() {
        final var givenSupposedPalindrome = " !+-_!@#$%*()}{][";

        final var actualOutput = solution.isPalindrome(givenSupposedPalindrome);

        Assertions.assertTrue(actualOutput);
    }
}