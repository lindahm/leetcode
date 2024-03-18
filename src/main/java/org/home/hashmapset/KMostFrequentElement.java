package org.home.hashmapset;

import java.util.*;

public class KMostFrequentElement {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> numFrequency = new HashMap<>();
        List<Integer>[] numByFrequency = new List[nums.length + 1];
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            numFrequency.put(num, numFrequency.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : numFrequency.entrySet()) {
            List<Integer> numList = numByFrequency[entry.getValue()];
            if (numList == null) {
                numList = new ArrayList<>();
                numByFrequency[entry.getValue()] = numList;
            }
            numList.add(entry.getKey());
        }

        for (int i = numByFrequency.length - 1; result.size() < k && i >= 0; i--) {
            if (numByFrequency[i] != null) {
                result.addAll(numByFrequency[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
