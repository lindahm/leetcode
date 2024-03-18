package org.home.hashmapset;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagrams {
    public List<List<String>> solution(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();

        for (final String str : strs) {
            char[] key = str.toCharArray();
            Arrays.sort(key);
            String s = String.copyValueOf(key);
            // Slower
//            String key = str.chars().mapToObj(Character::toString).sorted().collect(Collectors.joining());
            groupedAnagrams.computeIfAbsent(s, k -> new ArrayList<>()).add(str);
        }

        return groupedAnagrams.values().stream().toList();
    }
}
