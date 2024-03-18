package org.home.hashmapset;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public int solution(String s) {
        char[] characters = s.toCharArray();
        Map<Character, Integer> charCounter = new HashMap<>();
        int result = -1;

        for (char c : characters) {
            charCounter.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        for (int i = 0; i < characters.length; i++) {
            if (charCounter.get(characters[i]).equals(1)) {
                result = i;
                break;
            }
        }

        return result;
    }
}
