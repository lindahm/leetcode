package org.home.hashmapset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must appear as many times as it shows in both arrays
 * and you may return the result in any order.
 */
public class Intersect {

    public int[] solution(int[] nums1, int[] nums2) {
        Map<Integer, Integer> appearanceCounterByNum = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i : nums1) {
            appearanceCounterByNum.compute(i, (k, v) -> v == null ? 1 : v + 1);
        }

        for (int i : nums2) {
            Integer numAppearance = appearanceCounterByNum.get(i);
            if (numAppearance != null && numAppearance > 0) {
                result.add(i);
                appearanceCounterByNum.put(i, numAppearance - 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
