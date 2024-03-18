package org.home.hashmapset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringUniqueChars {

    public static int lengthOfLongestSubstring(String s) {
        // O(n) time | O(n) space
        HashMap<Character, Integer> seenCharByIndex = new HashMap<>();
        int maxSubstring = 0;

        for (int left = 0, right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            Integer duplicateCharIndex = seenCharByIndex.get(currentChar);

            if (duplicateCharIndex != null && duplicateCharIndex >= left) {
                left = duplicateCharIndex + 1;
            }
            seenCharByIndex.put(currentChar, right);
            maxSubstring = Math.max(maxSubstring, right - left + 1);
        }
        return maxSubstring;
    }
}
